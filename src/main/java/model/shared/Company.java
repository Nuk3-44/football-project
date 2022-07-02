package model.shared;

import model.store.club.ClubStore;
import model.store.contract.ContractStore;
import model.store.user.*;

public class Company {

    private String designation;
    private static ClubStore clubStore;
    private static DirectorStore directorStore;
    private static ContractStore contractStore;
    private static UserStore userStore;

    public Company(String designation) {
        this.designation = designation;
        clubStore = new ClubStore();
        directorStore = new DirectorStore();
        contractStore = new ContractStore();
        userStore = new UserStore();
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public static ClubStore getClubStore() {
        return clubStore;
    }

    public static void setClubStore(ClubStore clubStore) {
        Company.clubStore = clubStore;
    }

    public static DirectorStore getDirectorStore() {
        return directorStore;
    }

    public static void setDirectorStore(DirectorStore directorStore) {
        Company.directorStore = directorStore;
    }

    public static ContractStore getContractStore() {
        return contractStore;
    }

    public static void setContractStore(ContractStore contractStore) {
        Company.contractStore = contractStore;
    }

    public static UserStore getUserStore() {
        return userStore;
    }

    public static void setUserStore(UserStore userStore) {
        Company.userStore = userStore;
    }
}
