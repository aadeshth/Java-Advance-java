package com.desingpatten.abscractfactory;

public interface AbstractFactory {
    SchoolGrade getGrade(String type);
    static AbstractFactory getFactory(String factoryType)
    {
        if(factoryType.equalsIgnoreCase("school"))
        {
            return new SchoolGradeFactory();
        }
        return null;
    }
}
