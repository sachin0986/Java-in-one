package keywords;



class super_class
{
    void show()
    {
        System.out.print("Hi.... " + "\n" + " This is Super-Class");    
    }
}

class base_class extends super_class
{
    void show()
    {
        System.out.println("Hi.... " + "\n" + " This is Base-Class");
    }


    void display()
    {

        //we just write Show() to access the base class method..

        show();// base class method calling


        //we add super keyword to access the Super-class method

        super.show(); //super class method calling 
    }
}
public class Super_methods 
{
    public static void main(String args[])
    {
        //creating the object of last class 
        
        base_class bc = new base_class();
        bc.display();
        
    }    
}
