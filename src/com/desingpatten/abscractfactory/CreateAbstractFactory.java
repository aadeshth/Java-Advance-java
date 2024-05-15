package com.desingpatten.abscractfactory;

public class CreateAbstractFactory {

    public static AbstractFactory getFactory(String type)
    {
        if(type.equalsIgnoreCase("school"))
        {
            return new SchoolGradeFactory();
        }
        return null;
    }
}
