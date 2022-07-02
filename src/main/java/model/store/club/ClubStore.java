package model.store.club;

import model.conceptual.club.Club;
import model.conceptual.user.User;

import java.util.ArrayList;
import java.util.List;

public class ClubStore {

    private List<Club> clubList;

    public ClubStore() {
        this.clubList = new ArrayList<>();
    }

    public List<Club> getClubList() {
        return clubList;
    }

    public void setClubList(List<Club> clubList) {
        this.clubList = clubList;
    }
}
