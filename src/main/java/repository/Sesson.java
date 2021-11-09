package repository;

import model.user.User;

public class Sesson {
    private static User currentUser;

    public static User getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(User currentUser) {
        Sesson.currentUser = currentUser;
    }
}
