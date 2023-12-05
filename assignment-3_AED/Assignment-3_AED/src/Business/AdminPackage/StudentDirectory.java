/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AdminPackage;


import Business.CoursePackage.Course;
import java.util.ArrayList;

/**
 *
 * @author smatcha
 
 */
public class StudentDirectory {
    ArrayList<Student> studentDirectory;
    
    public StudentDirectory(){
        studentDirectory= new ArrayList<>();
    }
    
    public ArrayList<Student> getStudentDir() {
        return studentDirectory;
    }
    
    public void addStudentToStudentDirectory(Student student){
        studentDirectory.add(student);
    }
    
    public void removeStudentFromStudentDirectory(Student student){
        studentDirectory.remove(student);
    }
    
    public Student getStudentByUserId(String userId){
        for(Student student : studentDirectory)
            if(student.getUserId().equals(userId))
                return student;
        return null;     
    }
    
    public boolean doesStudentProfileExist(String studentId){
        for(Student student : studentDirectory)
            if(student.getUserId().equals(studentId))
                return true;
        return false;
    }
  
    
}
