package model.store.contract;

import model.conceptual.contract.Contract;

import java.util.ArrayList;
import java.util.List;

public class ContractStore {

    private List<Contract> contractList;

    public ContractStore() {
        this.contractList = new ArrayList<>();
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }
}
