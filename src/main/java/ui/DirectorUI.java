package ui;

import model.conceptual.user.User;

public class DirectorUI implements Runnable {

    private User director;

    public DirectorUI(User director) {
        this.director = director;
    }

    public User getDirector() {
        return director;
    }

    public void setDirector(User director) {
        this.director = director;
    }

    @Override
    public void run() {



    }
}
