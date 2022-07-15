package model.store;

import model.conceptual.Injury;

import java.util.ArrayList;
import java.util.List;

public class InjuryStore {

    private List<Injury> injuryList;

    public InjuryStore() {
        this.injuryList = new ArrayList<>();
    }

    public List<Injury> getInjuryList() {
        return injuryList;
    }

    public void setInjuryList(List<Injury> injuryList) {
        this.injuryList = injuryList;
    }
}
