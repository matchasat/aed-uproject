/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AdminPackage;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Business.CoursePackage.Course;


/**
 *@author asus

 */
public class Student {

    String fullName;
    String userId;
    String password;
    String domain;
    Boolean isAccActive;
    ArrayList<Course> courseList;
    Transcript transcript;



    public Student() {
        courseList = new ArrayList<>();
        transcript = new Transcript(this);
        isAccActive = true;     
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public void addCourseToStudent(Course newCourse) {      
        courseList.add(newCourse);
        JOptionPane.showMessageDialog(null, "Course has been registered successfully!");

    }
    
    public void addCourseToTheStudent(Course newCourse) {      
        courseList.add(newCourse);

    }

    public Boolean getIsAccActive() {
        return isAccActive;
    }

    public void setIsAccActive(Boolean isAccActive) {
        this.isAccActive = isAccActive;
    }
    public String getFullName() {
        return fullName;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getDomain() {
        return domain;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        return userId;
    }
}
