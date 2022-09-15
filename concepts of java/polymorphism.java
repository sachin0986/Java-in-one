
/*polymorphism means "having many forms "
//There are two types 
1) Compile-Time (Overloading)
* note:- java doesnot support the operator overloading...!
2)Run-Time (Overriding)

1)--*/


class overLoading1
{
    static int Product(int a, int b)
    {
        return a * b;
    }

    static double Product(double a, double b)
    {
        return a * b;
    }

    static int Product(int a, int b, int c)
    {
        return a * b * c;
    }

}

//2)--

class G_Parent
{
    void print()
    {
        System.out.println("this is parent class");
    }
}

class parent extends G_Parent
{
    void print()
    {
        System.out.println("this is Parent class");
    }
}

class child extends G_Parent
{
    void print()
    {
        System.out.println("This is child class");
    }
}
public class polymorphism 
{
    public static void main(String args[])
    {
    // 1 calling for overloading    
    
    //System.out.println(overLoading1.Product(3, 5)+ "\n" + overLoading1.Product(3.67, 7.89)+ "\n" + overLoading1.Product(45, 78, 89));
    
    // 2 calling for overriding
        // * we have to leave it after just making object because we have to speicify that which method we have to call 

        G_Parent g;

        //calling them by object
        //we have to seprate the line "G_Parent g = new G_Parent();" because of idnetification of which
        //class method we are calling.
        g = new parent();
        g.print();

        g = new child();
        g.print();

    }
}
