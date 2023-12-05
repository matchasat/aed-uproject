/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AdminPackage;

import java.util.ArrayList;

/**
 *
 *@author user
 */
public class FacultyDirectory {

    ArrayList<Faculty> facultyDirectory;

    public FacultyDirectory() {
        facultyDirectory = new ArrayList<>();
    }

    public void addFacultyToFacultyDirectory(Faculty faculty) {
        facultyDirectory.add(faculty);
    }

    public void removeStudentFromStudentDirectory(Faculty faculty) {
        facultyDirectory.remove(faculty);
    }

    public Faculty getFacultyByFacultyId(String facultyId) {
        for (Faculty faculty : facultyDirectory) {
            if (faculty.getFacultyId().equals(facultyId)) {
                return faculty;
            }
        }
        return null;
    }

    public boolean doesFacultyProfileExist(String faculty_id) {
        for (Faculty faculty : facultyDirectory) {
            if (faculty.getFacultyId().equals(faculty_id)) {
                return true;
            }
        }
        return false;
    }
}
