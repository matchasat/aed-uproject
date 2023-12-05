/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AdminPackage;
import java.util.HashMap;
import Business.CoursePackage.Course;

/**
 *
 * @author asus
 
 */
public class Transcript {
    HashMap<String, String> grade;
    HashMap<String, String> course_status;
    String out;
    Student student;
      
    public Transcript(Student student){
        grade = new HashMap<>();
        course_status = new HashMap<>();
        this.student = student;      
    }

    public Student getStudent() {
        return student;
    }
    
    public HashMap<String, String> getCourseStatus() {
        return course_status;
    }

    public void setCourseStatus(String a, String b) {
        this.course_status.put(a, b);
    }
    
    public HashMap<String, String> getGrade() {
        return grade;
    }

    public void setGrade(String a, String b) {
        this.grade.put(a, b);
    }
    
    public int numberOfCompletedCourses(){
        int coursesCount =0;
        HashMap<String, String> map = student.getTranscript().getCourseStatus();
            for(Course course : this.student.getCourseList()){
             if(map.get(String.valueOf(course.getCourseId())).equals("PASS") ){
           //      buffer+=("\n"+course.getCourseName()+"\t\t"+this.grade.get(String.valueOf(course.getCourseId()))+": "+ map.get(String.valueOf(course.getCourseId())));
                 coursesCount++;
             }
        }
            return coursesCount;
    }
    
    
    public String generateTranscript(){
        HashMap<String, String> map = student.getTranscript().getCourseStatus();
        String buffer="TRANSCRIPT\n"+"-------------------";
        if(numberOfCompletedCourses() >= 8){
            buffer+=("\n STUDENT: "+this.student.getFullName()+ " HAS GRADUTED AFTER PASSING " + numberOfCompletedCourses()+" courses"+"\n\n"); 
        }
        else{
            buffer+=("\n ***STUDENT: "+this.student.getFullName()+ " NEEDS TO PASS " + (8 -numberOfCompletedCourses())+" more courses to graduate***"+"\n\n");
        }
        System.out.println(map);
        buffer+=("\nSTUDENT NAME : "+this.student.getFullName()+"\n\n");
        buffer+="Course Name\tGrade\n---------------------------------";
        for(Course course : this.student.getCourseList()){
             if(map.get(String.valueOf(course.getCourseId())).equals("PASS") ||
                     map.get(String.valueOf(course.getCourseId())).equals("FAIL") ){
                 buffer+=("\n"+course.getCourseName()+"\t\t"+this.grade.get(String.valueOf(course.getCourseId()))+": "+ map.get(String.valueOf(course.getCourseId())));
                 
             }
        }
        return buffer;
        
    }
    
}
