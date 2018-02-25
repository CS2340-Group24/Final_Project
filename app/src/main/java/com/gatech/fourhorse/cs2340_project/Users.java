package com.gatech.fourhorse.cs2340_project;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by nullpo on 2/25/18.
 */

public class Users {

    private static LinkedList<User> userList = new LinkedList<User>();

    public static LinkedList<User> getUserList() {
        return userList;
    }
    public static void removeUser(User user){
        userList.remove(user);
    }

    public static void addUser(User user){
        userList.add(user);
    }


}
