package com.gatech.fourhorse.cs2340_project;

/**
 * Created by nullpo on 2/25/18.
 */

public class CommonPresenter {

    public static boolean createUser(String username, String passwd, String str_type){
        //What is efficiency?
        Type type;
        if (str_type.equals("User")){
            type = Type.USER;
        } else {
            type = Type.ADMIN;
        }
        User new_user = new User(username,passwd,type);
        for (User user : Users.getUserList()){
            if(new_user.getUsername().equals(user.getUsername())) {
                return false;
            }
        }
        Users.getUserList().add(new_user);
        System.out.println("HELLO");
        return true;
    }

    public static boolean loginUser(String username, String passwd){
        for (User user : Users.getUserList()){
            if(username.equals(user.getUsername()) && passwd.equals(user.getPasswd())) {
                return true;
            }
        } return false;
    }

}
