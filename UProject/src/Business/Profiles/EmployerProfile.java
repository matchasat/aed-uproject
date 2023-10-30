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
public class EmployerProfile extends Profile{
    
    public EmployerProfile(Person p) {

        super(p); 

    }
    @Override
    public String getRole(){
        return  "Employer";
    }
}
