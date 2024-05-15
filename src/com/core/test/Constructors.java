package com.core.test;

public class Constructors {
    int age;
    String name;
    Constructors(){
        System.out.println("In Default Constructor!");
    }
    Constructors(Integer age, Character division){
        System.out.println("Age: "+age+" division: "+division);
    }
    Constructors(Student copyObject)
    {
        this.age = copyObject.age;
        this.name = copyObject.name;
    }
    public static void main(String[] args) {
//        Integer age = Integer.valueOf(10);
//        Character character = Character.valueOf('A');
//        Constructors constructors = new Constructors(11, 'D');


//        Constructors constructors1 = new Constructors(copyObject);
//        System.out.println(constructors1.age);
//        System.out.println(constructors1.name);

        Student student = new Student();
        student.setName("SARTHAK");
        System.out.println(student.getName());
        System.out.print("");
        print();
    }
    // Parameterised method
    public static void print()
    {
        System.out.println("Test Print!");
    }
    public void getPerformAddition()
    {
    }
    public void getPerformAddition(int a , int b)
    {
    }

    public int getPerformSubstraction(int a, int b , int c ,int d)
    {
        return 0;
    }


}
