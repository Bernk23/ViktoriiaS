package com.svyrydova.hw16.task4;

import java.util.LinkedList;
import java.util.List;

public class Test {

    final protected static List<Student> studentList = new LinkedList<>();

    public static void main(String[] args) {

        studentList.add(new Student("Ivan", "4-J", 2, 5));
        studentList.add(new Student("Anna", "4-J", 4, 3));
        studentList.add(new Student("Lisa", "3-J", 5, 2));
        studentList.add(new Student("Name2", "3-J", 3, 3));
        studentList.add(new Student("Karina", "3-J", 5, 2));
        studentList.add(new Student("Egor", "3-J", 3, 3));
        studentList.add(new Student("Maks", "3-J", 1, 2));


        System.out.println(studentList.toString());
        printStudents(studentList, 2);
        System.out.println(delStudents());
    }

    public static List<Student> delStudents() {
        studentList.removeIf(student -> student.getPoints() < 3);
        studentList.removeIf(student -> student.getGrade() > 6);
        studentList.forEach(student -> student.addGrade(1));
        return studentList;
    }

    public static void printStudents(List<Student> students, int grade) {
        students.stream().
                filter(student -> student.getGrade() == grade).
                map(Student::toString).
                forEach(System.out::println);
    }
}