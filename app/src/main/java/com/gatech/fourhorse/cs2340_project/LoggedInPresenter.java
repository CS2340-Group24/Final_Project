package com.gatech.fourhorse.cs2340_project;

/**
 * Created by nullpo on 2/25/18.
 */

public class LoggedInPresenter {
    public static User _user;


    public User getUser() {
        return _user;
    }

    public void setUser(User user) {
        _user = user;
    }

    static boolean login(String username, String passwd) {
        for (User user : Users.getUserList()) {
            if (username.equals(user.getUsername()) && passwd.equals(user.getPasswd())) {
                _user = user; //wow android studio was being dumb with this line
                return true;
            }
        }
        return false;
    }
}
