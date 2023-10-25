/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Transcript;

/**
 *
 * @author User
 */
public class Transcript {
    private String CourseName;
    private String CourseType;
    private String FinalGrade;
    private String DatePrinted;

    public String getDatePrinted() {
        return DatePrinted;
    }

    public void setDatePrinted(String DatePrinted) {
        this.DatePrinted = DatePrinted;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public String getCourseType() {
        return CourseType;
    }

    public void setCourseType(String CourseType) {
        this.CourseType = CourseType;
    }

    public String getFinalGrade() {
        return FinalGrade;
    }

    public void setFinalGrade(String FinalGrade) {
        this.FinalGrade = FinalGrade;
    }
    
    
}
