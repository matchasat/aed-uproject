/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.general;

import java.util.ArrayList;

/**
 *
 * @author smatcha
 */
public class WorkExperience {

    private Integer totalNoOfYears;
    private ArrayList<Experience> experiences;

    public WorkExperience(Integer totalNoOfYears, ArrayList<Experience> experiences) {
        this.totalNoOfYears = totalNoOfYears;
        this.experiences = experiences;
    }

    public Integer getTotalNoOfYears() {
        return totalNoOfYears;
    }

    public void setTotalNoOfYears(Integer totalNoOfYears) {
        this.totalNoOfYears = totalNoOfYears;
    }

    public ArrayList<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(ArrayList<Experience> experiences) {
        this.experiences = experiences;
    }
}

