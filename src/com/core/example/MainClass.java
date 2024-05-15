package com.core.example;

import java.io.*;

public class MainClass {
   transient int number= 100;
public static void main(String[]args) throws IOException, ClassNotFoundException {

    Student student = new Student();
    System.out.println(student.id);
    System.out.println(student.name);
    System.out.println(student.age);
    FileOutputStream fileOutputStream = new FileOutputStream("a.txt");
    ObjectOutputStream objectOutputStream  = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(student);
    FileInputStream fileInputStream = new FileInputStream("a.txt");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    Student student1 = (Student) objectInputStream.readObject();
    System.out.println(student1.id);
    System.out.println(student1.name);
    System.out.println(student1.age);


}
}
