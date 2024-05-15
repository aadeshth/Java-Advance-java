package com.desingpatten.factoryPattern;

public class TestFactory {
    public static void main(String[] args) {
        SchoolGradeFactory schoolGradeFactory = new SchoolGradeFactory();
        FirstGrade firstGrade = (FirstGrade) schoolGradeFactory.getGrade("3");
        firstGrade.printGrade();

    }
}
