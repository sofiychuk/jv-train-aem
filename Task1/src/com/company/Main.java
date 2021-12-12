package com.company;

public class Main {
    public static void main(String[] args) {
        Cathedra cathedra = new Cathedra();
        cathedra.fillStudentsList();
        cathedra.fillStudentsSummaryList();
        System.out.println("Список всех студентов после сессии:");
        cathedra.printStudentsInfo();
        cathedra.makeDecision();
        System.out.println("Список студентов, которые перешли на следующий курс:");
        cathedra.printStudentsInfo();
    }
}
