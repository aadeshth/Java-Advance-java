package com.desingpatten.abscractfactory;

public class TestFactory {
    public static void main(String[] args) {
        SchoolGradeFactory schoolGradeFactory = (SchoolGradeFactory) AbstractFactory.getFactory("school");
        FirstGrade firstGrade = (FirstGrade) schoolGradeFactory.getGrade("1");
        firstGrade.printGrade();
    }
}
