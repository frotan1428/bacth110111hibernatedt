package com.hb01.ontoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Diary {

    @Id
    private int id;
    private String name;
    @OneToOne
    //@JoinColumn (name = "std_id")
   private Student03  student;// student_id
    // generate getter/ setter
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

    public Student03 getStudent03() {
        return student;
    }


    public void setStudent03(Student03 student03) {
        this.student = student03;
    }

    // generate To String method

    @Override
    public String toString() {
        return "Diary{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", student03=" + student +
                '}';
    }
}
