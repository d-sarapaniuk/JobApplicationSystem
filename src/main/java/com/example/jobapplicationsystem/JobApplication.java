package com.example.jobapplicationsystem;

public class JobApplication {
    private int ID;
    private String Title;
    private String Location;
    private int Salary;
    public JobApplication(int id, String title, String location, int salary){
        ID = id;
        Title = title;
        Location = location;
        Salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
