/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author smatcha
 */
public class EmployerDirectory {

    ArrayList<EmployerProfile> employerlist;

    public EmployerDirectory() {

        employerlist = new ArrayList();

    }

    public EmployerProfile newEmployerProfile(Person p) {

        EmployerProfile sp = new EmployerProfile(p);
        employerlist.add(sp);
        return sp;
    }

    public EmployerProfile findEmployer(String id) {

        for (EmployerProfile sp : employerlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null; //not found after going through the whole list
    }

}
