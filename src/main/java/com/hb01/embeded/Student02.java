package com.hb01.embeded;

import javax.persistence.*;

@Entity
@Table(name = "t_Student02")
public class Student02 {

    @Id
    private int id ;

    @Column(length = 50, nullable = false)
    private int grade;

    private String name;


    @Embedded // this is optional if you want you can not use.
    private Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student02{" +
                "id=" + id +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
