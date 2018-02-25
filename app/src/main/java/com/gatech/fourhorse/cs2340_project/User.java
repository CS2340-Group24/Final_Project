package com.gatech.fourhorse.cs2340_project;

/**
 * Created by nullpo on 2/25/18.
 */

public class User {

    private String username;
    private String passwd; //what is security
    private Type type;

    public User(String username, String passwd, Type type){
        this.username = username;
        this.passwd = passwd;
        this.type = type;
    }

    public User(String username, String passwd) {
        this.username = username;
        this.passwd = passwd;
        type = Type.USER; //maybe I just really care about stack space
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
