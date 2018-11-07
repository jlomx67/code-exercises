package com.hackerrank.java.language.medium;

import java.util.*;

public class JavaPriorityQueuePriorities {

    public List <JavaPriorityQueueStudent> getStudents(List< String > events) {
        PriorityQueue <JavaPriorityQueueStudent> student_queue =
                new PriorityQueue(Comparator.comparing(JavaPriorityQueueStudent::getCgpa).reversed()
                        .thenComparing(JavaPriorityQueueStudent::getName)
                        .thenComparing(JavaPriorityQueueStudent::getID));
        List <JavaPriorityQueueStudent> students = new ArrayList<JavaPriorityQueueStudent>();
        for (String thisEvent : events) {
            Scanner in = new Scanner(thisEvent);
            String event = in.next();
            if (event.equals("ENTER")) {
                String name = in.next();
                float cgpa = in.nextFloat();
                int id = in.nextInt();

                JavaPriorityQueueStudent student = new JavaPriorityQueueStudent(id, name, cgpa);
                student_queue.add(student);
            } else if (event.equals("SERVED")) {
                JavaPriorityQueueStudent first = student_queue.poll();
            } in .close();
        }
        JavaPriorityQueueStudent first = student_queue.poll();
        if (first == null) {
            return students;
        } else {
            while (first != null) {

                students.add(first);
                first = student_queue.poll();

            }
            return students;
        }

    }
}
