/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccounts;

import Business.Profiles.Profile;

/**
 *
 * @author smatcha
 */
public class UserAccount {

    Profile profile;
    String username;
    String password;

    public UserAccount(Profile profile, String un, String pw) {
        username = un;
        password = pw;
        this.profile = profile;

    }

    public String getPersonId() {
        return profile.getPerson().getPersonId();
    }

    public String getUserLoginName() {
        return username;
    }

    public boolean isMatch(String id) {
        if (getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public boolean IsValidUser(String un, String pw) {

        if (username.equalsIgnoreCase(un) && password.equals(pw)) {
            return true;
        } else {
            return false;
        }

    }

    public String getRole() {
        return profile.getRole();
    }

    public Profile getAssociatedPersonProfile() {
        return profile;
    }

    @Override
    public String toString() {

        return getUserLoginName();
    }
}
