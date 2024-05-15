package com.core.example.myjava;

public class Main {
    private int sharedNumber=100;
    Integer numberVal= sharedNumber;
   Integer getNumberValObject = Integer.valueOf(100);
   Double perc = Double.valueOf(10.20);
    char codeFirst='C';
     boolean isCodeFirstOpen=true;

     float percentage= 60.50f;
     double percentageInDouble= 60.50;

    String[] names = {"code-first","java"};
    int[] arr  = {1,23,233,223};


    /* int, boolean, double char
    data type
     1: primitive data types
     2:
     */
    /*
    Java Modifiers / non access Modifiers

    Java Modifiers:
    Public
    private
    protected
    default

    non access Modifiers
static
final
abstract
synchronized
volatile

Keywords
..



     */
    public static void main(String[] args) {
        System.out.println("My First Java Program!");
        System.out.println(10);
        System.out.println(10.1);

//        Car carIn = new Car();
//        carIn.carInfo();
//        carIn.setCarInfo(1000,"TATA");
//        carIn.carInfo();
//        Car.printInfo(10,"TEST");
//        carIn.carInfo();
       /* int numOfComp= 200;
        String ownerName= "Mahindra";
//        Car car = new Car(numOfComp,ownerName);
       // car.carInfo();

        Car car1 = new Car("TATA");
        car1.carInfo();

        Car car2 = new Car(100);
        car2.carInfo();

        DemoClass demoClass = new DemoClass(5,"Java");
        Car car3 = new Car(demoClass);
        car3.carInfo();*/
//       System.out.println("car.getCompanyOwnerName() === "+car.getCompanyOwnerName());

        DemoClass demoClass = new DemoClass();
        int numOfComp= 200;
        String ownerName= "Mahindra";
        Car car = new Car(numOfComp,ownerName);
       // = car.getCompanyOwner();
    }
}

/*
Camel case
String firstName;
getData();
findByName(String firstName);

Pascal Case
MyFistClass
GetData();

Snake Case
first_name;
get_sum
get_data()

Kebab Case
first-name
get-sum
get-data
 */