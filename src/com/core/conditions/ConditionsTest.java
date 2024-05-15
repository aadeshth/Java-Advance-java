package com.core.conditions;

public class ConditionsTest {

    /* if(condition)
       { print();
       }
       // if else
       if(condition)
       { print();
       }else
       {
       print()
       }

       // if else if
       if(condition)
       { print();
       }else if(condition)
       {
       print()
       } else
       {
       }
    */
    public static void main(String[] args) {
        String name = "Nikhil";
        if(name == "subodh")
        {
            System.out.println(name);
        }else if(name == "Nikhil"){
            System.out.println(name);
        }else
        {
            System.out.println("Name not found!");
        }

        /*
          switch (input)
        {
            case value:
            ...
            break;
            case value:
            ...
            break;
            default:
            ...
        }
         */
        switch (name)
        {
            case "Subodh":
                System.out.println(name);
                break;
            case "Nikhil":
                System.out.println(name);
                break;
            case "Prashant":
                System.out.println(name);
                break;
            case "Dev":
                System.out.println(name);
                break;
            default:
                System.out.println("Name not found!");

        }
        int number = 10;
        if(number != 10){
            System.out.println(number);
        } else
            System.out.println("Found number : "+number);
        /*
          equal: ==
          not equal: !=
          less than: <
          grater than : >
          less than equal: <=
          greater than equal : >=
         */
        if(number >= 10)
        {
            System.out.println(number);
        }
    }

}
