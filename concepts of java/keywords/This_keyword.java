package keywords;

public class This_keyword 
{
    //Basic use of This keyword
    //always remember that the variable you created always with .this keyword 
    int a;
    int b;

    This_keyword(int aa, int bb)
    {
        this.a = aa;
        this.b = bb;
    }

    void display()
    {
        System.out.println("a = " + a + " " + "b = " + b);
    }

       public static void main(String args[])
       {
        This_keyword tk = new This_keyword(10, 78);
        tk.display();
       }
}
