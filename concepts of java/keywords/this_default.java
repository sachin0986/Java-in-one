package keywords;


public class this_default 
{

    int a;
    int b;

    //default constructor
    this_default()
    {
            a = 24;
            b = 78;
    }

    this_default get()
    {
        //mehtod that return current class variable
        return this;
    }

    void show()
    {
        System.out.println("a = " + a + " " + "b = " + b);
    }
    public static void main(String args[])
    {
        this_default td = new this_default();
        td.get().show();
    }    
}
