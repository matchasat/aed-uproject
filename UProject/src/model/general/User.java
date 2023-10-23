package model.general;


import java.util.ArrayList;
import model.Person;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author smatcha
 */
public class User {

    private Person person;
    private String userId;
    private String password;
    private ArrayList<String> prevPasswords;
    private boolean accountEnabled;

    public User(Person person, String userId, String password, ArrayList<String> prevPasswords, boolean accountEnabled) {
        this.person = person;
        this.userId = userId;
        this.password = password;
        this.prevPasswords = prevPasswords;
        this.accountEnabled = accountEnabled;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getPrevPasswords() {
        return prevPasswords;
    }

    public void setPrevPasswords(ArrayList<String> prevPasswords) {
        this.prevPasswords = prevPasswords;
    }

    public boolean isAccountEnabled() {
        return accountEnabled;
    }

    public void setAccountEnabled(boolean accountEnabled) {
        this.accountEnabled = accountEnabled;
    }
}
