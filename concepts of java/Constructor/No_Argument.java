/* Constructor : It is a special method to intilize bojects ,
the constructor is called when an object of class is created

types 
1) No-Argument Constructor
2) Parameterized Constructor
*/ 

// * Basic or No-Argument Constructor

import java.io.*;

public class No_Argument
{

    int number ;
    String Name ;

    
    No_Argument()
    {
        System.out.println("Constructor called");
    }
    
    


    public static void main(String args[])
    {
        //this would call default constructor 
        No_Argument bc = new No_Argument();

        //default constructor provide default values 
        System.out.println(bc.number);
        System.out.println(bc.Name);

    }
}