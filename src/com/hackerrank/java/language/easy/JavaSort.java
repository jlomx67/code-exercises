package com.hackerrank.java.language.easy;

import java.util.*;

public class JavaSort {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<JavaSortStudent> studentList = new ArrayList<JavaSortStudent>();
        JavaSortCompare orderStudens = new JavaSortCompare();

        studentList.add(new JavaSortStudent(33, "Rumpa", 3.68));
        studentList.add(new JavaSortStudent(85, "Ashis", 3.85));
        studentList.add(new JavaSortStudent(56, "Samiha", 3.75));
        studentList.add(new JavaSortStudent(19, "Samara", 3.75));
        studentList.add(new JavaSortStudent(22, "Fahim", 3.76));

        Collections.sort(studentList, orderStudens);

/*        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            JavaSortStudent st = new JavaSortStudent(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }*/

        for(JavaSortStudent st: studentList){
            System.out.println(st.getFname());
        }
    }
}
