package com.java.week4.june19;

import java.util.ArrayList;

class Student {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (GPA: " + gpa + ")";
    }
}

public class lessgpa {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Add some students to the ArrayList
        students.add(new Student("sai", "s", 3.5));
        students.add(new Student("rahul", "k", 4.0));
        students.add(new Student("arun", "g", 2.8));
        students.add(new Student("mani", "a", 3.2));

        System.out.println("Students before removal:");
        for (Student student : students) {
            System.out.println(student);
        }

        double sum = 0.0;
        for (Student student : students) {
            sum += student.getGpa();
        }
        double averageGpa = sum / students.size();

        students.removeIf(student -> student.getGpa() < averageGpa);

        System.out.println("\nStudents after removal:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
