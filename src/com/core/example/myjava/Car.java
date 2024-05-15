package com.core.example.myjava;

public class Car {

//    abstract getInfo();

//    public Car(int numberOfCompanies, String companyOwner)
//    {
//        this.companyOwner = companyOwner;
//        this.numberOfCompanies = numberOfCompanies;
//    }
//    public Car(int numberOfCompanies)
//    {
//     this.numberOfCompanies= numberOfCompanies;
//    }
//    public Car(String companyOwner)
//    {
//    this.companyOwner = companyOwner;
//    }
//    public Car() {
//
//    }
//
//    public Car(DemoClass demoClass)
//    {
//        this.companyOwner = demoClass.data;
//        this.numberOfCompanies = demoClass.count;
//    }
//    //Tata tata = new Tata();
//     void carInfo() {//       String link = tata.websiteLink;
//         System.out.println("My Car model is Tata Punch1");
//         System.out.println("company Name="+companyOwner);
//         System.out.println("no of company="+numberOfCompanies);
//    }
//
//
//    public void setCarInfo(int numberOfCompanies, String companyOwner)
//    {
//        this.companyOwner = companyOwner;
//        this.numberOfCompanies = numberOfCompanies;
//    }
    private int numberOfCompanies;
    private String companyOwner;

    public Car(int numOfComp, String ownerName) {
        this.companyOwner = ownerName;
        this.numberOfCompanies = numOfComp;
    }

    public int getNumberOfCompanies() {
        return numberOfCompanies;
    }

    public void setNumberOfCompanies(int numberOfCompanies) {
        this.numberOfCompanies = numberOfCompanies;
    }

    public String getCompanyOwner() {
        return companyOwner;
    }

    public void setCompanyOwner(String companyOwner) {
        this.companyOwner = companyOwner;
    }
}
