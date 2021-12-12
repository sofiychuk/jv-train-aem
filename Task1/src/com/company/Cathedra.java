package com.company;

import java.util.*;

public class Cathedra {
    public static int START_COURSE = 1;
    public static int FINISH_COURSE = 5;

    private List<Student> students;

    public Cathedra() {
        students = new LinkedList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void fillStudentsList() {
        students.add(new Student("Кручанов И.И.", 3, "MZD530"));
        students.add(new Student("Гамов П.П.", 2, "MZD430"));
        students.add(new Student("Лоскутин А. А.", 3, "MZD530"));
        students.add(new Student("Колючкин К. К.", 5, "MZD530"));
        students.add(new Student("Валерьев В.В.", 2, "MZD430"));
        students.add(new Student("Могучин М.М.", 4, "MZD430"));
        students.add(new Student("Сидров С.С.", 1, "MZD330"));
        students.add(new Student("Калиниченко Н.Н.", 5, "MZD230"));
        students.add(new Student("Зубров П.П.", 4, "MZD130"));
        students.add(new Student("Ломоносов С.С.", 3, "MZD530"));
        students.add(new Student("Меркулин И.И.", 2, "MZD430"));
        students.add(new Student("Хачеев С.С.", 1, "MZD330"));
        students.add(new Student("Гамасеев А.А.", 5, "MZD230"));
        students.add(new Student("Романов Р.Р.", 4, "MZD130"));
    }

    public void fillStudentsSummaryList() {
        for (Student student : students) {
            student.fillSummaryList();
        }
    }

    public void printStudentsInfo() {
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }

    public void makeDecision() {
        ListIterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (averageMark(student) >= 3) {
                student.updateCourse();
            } else {
                iterator.remove();
            }
        }
    }

    public double averageMark(Student student) {
        double averageMark = 0;
        for (Integer integer : student.getResults().values()) {
            averageMark += integer;
        }
        averageMark /= student.subjectsNumber();
        return averageMark;
    }
}
