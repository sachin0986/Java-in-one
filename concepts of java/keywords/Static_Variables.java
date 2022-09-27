

package keywords;

public class Static_Variables
{

    //1 creating method with static keyword 
    static void method1()
    {
        System.out.println("Calling it with out making object");
    }

    public static void main(String args[])
    {
        //just calling it by name 
        //did'nt create any object of it 
        method1();
    }
}