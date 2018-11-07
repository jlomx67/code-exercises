package com.hackerrank.java.language.easy;

import java.util.Comparator;

public class JavaSortCompare implements Comparator<JavaSortStudent> {

    @Override
    public int compare(JavaSortStudent student1, JavaSortStudent student2) {
        Double almostZero = 0.0001;
        if(Math.abs(student1.getCgpa() - student2.getCgpa()) > almostZero) {
            return student1.getCgpa() > student2.getCgpa() ? 1 : -1;
        }else if(!student1.getFname().equals(student2.getFname())){
            return student1.getFname().compareTo(student2.getFname());
        } else {
            return  student1.getId() - student2.getId();
        }
    }

}
