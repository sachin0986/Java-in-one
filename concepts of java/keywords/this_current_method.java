package keywords;

public class this_current_method 
{
    void dis()
    {
        //calling method show() using this 
        this.show();


        System.out.println("Sachin Arora");  //body of dis() method
    }    


    //show() method body
    void show()
    {
        System.out.println("My name is ");
    }

    public static void main(String args[])
    {
        this_current_method tcm = new this_current_method();
        tcm.dis();
    }
}
