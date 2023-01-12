package com.hbo1.annotaion;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // convert a java class to DB table  student01
@Table(name = "t_student01")
public class Student01 {


    @Id  // specifies the primary key on th table
    private int id;

    @Column(name = "std_name",length = 100)
    private String name;
    @Column(name = "std_garde")
    private int grade;
    // generate getter/setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // toString method


    @Override
    public String toString() {
        return "Student01{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
