

public class parameterized_const 
{

    //creating variables to call by this() method 
    String Name, Post;
    int ID;


    parameterized_const(String empName, String empPost, int empID )
    {
        //the variable you create should be on left side or "this.variable_Name"
        this.Name = empName;
        this.Post = empPost;
        this.ID = empID;
    }
    public static void main(String args[])
    {
        //Passing the values throw the arguments

        parameterized_const pc = new parameterized_const("Sachin", "Full-Stack Developer", 1456);

        System.out.println("Name of Employe: " + pc.Name + "\n" + "Post of Employe: " + pc.Post + "\n" + "Name of Employe: "+ pc.ID);

    }
}
