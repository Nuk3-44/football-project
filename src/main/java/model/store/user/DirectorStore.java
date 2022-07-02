package model.store.user;

import model.conceptual.user.Director;

import java.util.ArrayList;
import java.util.List;

public class DirectorStore {

    private List<Director> directorList;

    public DirectorStore() {
        this.directorList = new ArrayList<>();
    }

    public List<Director> getDirectorList() {
        return directorList;
    }

    public void setDirectorList(List<Director> directorList) {
        this.directorList = directorList;
    }
}
