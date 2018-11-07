package com.hackerrank.java.language.easy;

public class JavaSortStudent {

    int id;
    String fname;
    double cgpa;

    public JavaSortStudent(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}
