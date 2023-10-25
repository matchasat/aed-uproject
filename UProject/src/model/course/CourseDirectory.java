/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.course;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class CourseDirectory {
    private ArrayList<course>CourseHistory;
    
    public CourseDirectory(){
        this.CourseHistory=new ArrayList<course>();
        
    }

    public ArrayList<course> getCourseHistory() {
        return CourseHistory;
    }

    public void setCourseHistory(ArrayList<course> CourseHistory) {
        this.CourseHistory = CourseHistory;
    }
    public course addCourse(){
        course c= new course();
        CourseHistory.add(c);
        return c;
    }
    public void deleteCourse(course c){
        CourseHistory.remove(c);
    }
    public  course searchCourse(String CourseCode){
        for(course c: CourseHistory){
            if(c.getCourseCode().equals(CourseCode)){
                return c;
            }
        }
        return null;
    }
}
