// copy constructor

public class copy_constructor
{

    int id;
    String name;

    public copy_constructor(int i, String s)
    {
        id = i;
        name = s;

    }

    public copy_constructor(copy_constructor cc)
    {
        id = cc.id;
        name = cc.name;
    }

    public void display()
    {
        System.out.println(id + " " + name);

    }
    public static void main(String args[])
    {
        copy_constructor c1 = new copy_constructor(12, "Sachin");
        copy_constructor c2 = new copy_constructor(c1);

        c1.display();  //Sample
        c2.display();  //copy
    }
}