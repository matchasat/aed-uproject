/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Person.Person;

/**
 *
 * @author smatcha
 */
public class ThirdPartyProfile extends Profile{
    Person person;
    String description;
    
//    Transcript transcript;
    //   EmploymentHistroy employmenthistory;

    public ThirdPartyProfile(Person p) {
        super(p);

//        transcript = new Transcript(this);
//        employmenthistory = new EmploymentHistroy();
    }
    
    @Override
    public String getRole() {
        return "ThirdParty";
    }

    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }
}
