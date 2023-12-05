/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CoursePackage;

import java.util.ArrayList;

/**
 *
 * @author User
 
 */
public class CourseCatalog {

    private ArrayList<Course> courseList;

    public CourseCatalog() {
        this.courseList = new ArrayList<Course>();
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void addCourseToCourseList(Course course) {
        courseList.add(course);
    }

}
