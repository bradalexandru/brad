package com.javafortesters.domainentities;

/**
 * Created by alexandru.brad on 4/27/2016.
 */
public class User {

    private String username;
    private String password;

    public User()
    {
        /* The below commented code is not needed anymore since We now have duplicated code, since the no-argument constructor has code to assign values to the
        fields, as does the constructor that does take arguments.*/
//        username = "username";
//        password = "password";

        this("username", "password");

    }


    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

// pag 49
//Try it for yourself. Make the fields public and in a test, set username and password to a
//        new value, and get the value just by accessing the field.
//        e.g.
//        User auser = new User();
//        auser.username = "bob";
//        assertEquals("not default username", "bob", auser.username);
