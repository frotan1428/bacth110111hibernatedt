package com.hb01.ontoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


///@getter
//@setter
//@Constructor
//@NoArgConstructor

@Entity

@Table(name = "t_student03")
public class Student03 {

    @Id
    private int id;
    @Column(name = "std_name" ,length = 50,nullable = false,unique = true)
    private String name;
    private int grade;

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



    @Override
    public String toString() {
        return "Student03{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
