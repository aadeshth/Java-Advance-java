package com.desingpatten.abscractfactory;

public class SchoolGradeFactory implements AbstractFactory {

    public SchoolGrade getGrade(String gradeType)
    {
        if(gradeType.equalsIgnoreCase("first")||gradeType.equalsIgnoreCase("1"))
        {
            return new FirstGrade();
        }
        else if(gradeType.equalsIgnoreCase("second")||gradeType.equalsIgnoreCase("2"))
        {
            return new SecondGrade();
        } else  if(gradeType.equalsIgnoreCase("third")||gradeType.equalsIgnoreCase("3"))
        {
            return new ThirdGrade();
        }
        return null;
    }
}
