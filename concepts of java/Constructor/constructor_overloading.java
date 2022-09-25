
//constructor have same name with different arguments 


public class constructor_overloading 
{



    constructor_overloading(String Filename)
    {
        System.out.println("Constructor with 1 argument : " + Filename );
    }

    constructor_overloading(String owner, int Code)
    {
        System.out.println("Constructor with 2 arguments : " + owner + "     " + Code );   
    }

    constructor_overloading(long num, String gmail, long ID)
    {
        System.out.println("Constructor with 3 arguments : " + num + "     " + gmail + "     " + ID);
    }
    public static void main(String args[])
    {
        constructor_overloading co = new constructor_overloading("Constructor-Overloading.java");
        co = new constructor_overloading("Sachin", 8907);
        co = new constructor_overloading(569066684, "sachinarora0986@gmail.com", 567809);
    }
}
