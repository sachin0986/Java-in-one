//code to impliment the final keyword with variable 
/*when the variable is decleared with the final keyword the the value of that variable 
can't be changed */

package keywords;

import java.util.*;

public class Final_Variables 
{
     //simple final variable decleration 

    void simple()
    {
        final int i;
        i = 20;

        System.out.println(i);
    }
    //decleration of multiple final variables
    void multiple()
    {
        final int a;
        {
            a = 5;
        }

        final String c;
        {

            c = "SACHIN";
        }
        final long d;
        {
            d = 827948078;
        }
        final double pi = 3.14;


        System.out.println("int = " + a + "\n" + "String = " + c + "\n" + "long = " + d + "\n" + "double = " + pi);

    }

    
// implementing final keyword with array 
    void array()
    {
        final int arr[] = {1,45,67,89,0}; //array


        for(final int i : arr)   //forEach loop with final keyword
        System.out.println(i + " ");
    }
    public static void main(String args[])
    {
        Final_Variables Fv = new Final_Variables();
        //Fv.simple();

        //Fv.multiple();

        Fv.array();
    }    
}
