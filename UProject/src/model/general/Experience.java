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
public class Experience {

    private String title;
    private String company;
    private String fromDate;
    private String toDate;
    private ArrayList<String> description;

    public Experience(String title, String company, String fromDate, String toDate, ArrayList<String> description) {
        this.title = title;
        this.company = company;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public ArrayList<String> getDescription() {
        return description;
    }

    public void setDescription(ArrayList<String> description) {
        this.description = description;
    }
}

