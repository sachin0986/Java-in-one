package keywords;


abstract class Base //base class is just holdes the abstract method 
{
    abstract void Base1();
    
} 

class Parent extends Base
{

    void Base2()
    {
        System.out.println("Arora");
    }

    
    void Base1() // method with abstract keyword defined in Parent class
    {
        
        System.out.println("Sachin");
        
    }
}

public class Abstract_K  //main class with public access modifier 
{

    public static void main(String args[])
    {
        Parent p = new Parent();
        p.Base1();
        p.Base2();
    }
}

