/*The static keyword is mainly used for memory management
applicale for only

1) Variables 
2) Blocks
3)  Methods
4) Classes
*/

package keywords;

public class Static_Keyword
{
    

    //1 creating method with static keyword 
    static void method1()
    {
        System.out.println("Calling it with out making object");
    }

     //2 program to demonstrate use of static block & variable

    // static varables 
        static int a = 10;
        static int b;

        //static block
        static 
        {
            System.out.println("Static block initilized. ");
            b = a*4;
        }

        
    

    public static void main(String args[])
    {
        //just calling it by name 
        //did'nt create any object of it 
        
        //method1();

        //printing 
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
    }
}