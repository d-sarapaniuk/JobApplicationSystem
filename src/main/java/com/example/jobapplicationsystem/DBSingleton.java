package com.example.jobapplicationsystem;

public class DBSingleton {
    private static final DBSingleton instance = new DBSingleton();
    private JobApplication[] jobApplications;

    private DBSingleton(){}
    public static DBSingleton getInstance(){
        return instance;
    }

    public JobApplication[] getJobApplications() {
        return jobApplications;
    }

    public void setJobApplications(JobApplication[] jobApplications) {
        this.jobApplications = jobApplications;
    }
}
