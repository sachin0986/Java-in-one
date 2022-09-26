package keywords;


class Parent_c
{
    Parent_c()
    {
        System.out.println("Parent_c class Constructor");
    }
}

class Child_c extends Parent_c
{
    Child_c()
    {
        //Write super() to invoke the constructor of Parent class 
        super();

        //child class statement 
        System.out.println("Child class Constructor");
    }

    
}
public class Super_Constructor 
{
    public static void main(String args[])
    {
        // creating onject to call both constructor from child class 
        
        Child_c cc = new Child_c();
    }
}
