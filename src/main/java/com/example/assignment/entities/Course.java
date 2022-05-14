package com.example.assignment.entities;

public class Course {

    private long id;
    private String title;
    private String dscription;

    public Course(long id, String title, String dscription) {

        super();
        this.id = id;
        this.title = title;
        this.dscription = dscription;
    }

    public Course() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDscription() {
        return dscription;
    }

    public void setDscription(String dscription) {
        this.dscription = dscription;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", dscription='" + dscription + '\'' +
                '}';
    }
}
