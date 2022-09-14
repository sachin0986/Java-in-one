class Area 
{
    double length;
    double breadth;

    //constructor
    Area(Double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;

    }

    void getArea()
    {
        double area = length * breadth;
        System.out.println("Area = " + area);
    }
}

//to access variable of class 
class use_name
{
    private int age;//private is use to hide data .
    public int getage()
    {
        return age;
    }

    public void setage(int u_age)
    {
        this.age = u_age;
    }
}

// multiple methods

class U_account
{
    private int Acc_number;
    private String Acc_Holder_name;
    private String Acc_gmail;
    private float Acc_amount;


    public int get_number()
    {
        return Acc_number;
    }

    public void set_number(int acc_number)
    {
        this.Acc_number = acc_number;
    }

    public String get_holder()
    {
        return Acc_Holder_name;
    }
    public void set_holder(String accH_name)
    {
        this.Acc_Holder_name = accH_name;
    }

    public String get_gmail()
    {
        return Acc_gmail;
    }

    public void set_gmail(String u_gmail)
    {
        this.Acc_gmail = u_gmail;
    }

    public float get_amount()
    {
        return Acc_amount;
    }
    public void set_amount(float t_amount)
    {
        this.Acc_amount = t_amount;
    }

}
public class encapsulation 
{
 public static void main(String args[])
 {
    //Area ar = new Area(2.5, 8.8);
    //ar.getArea();

    //use_name us = new use_name();
// * this 19 => setage => u_age = age => getage and it's return to age.
    //us.setage(19);

    //System.out.println("User age = " + us.getage());

    //multiple methods objects
        U_account acc = new U_account();
        acc.set_number(2345670);
        acc.set_holder("Sachin Arora");
        acc.set_gmail("sachinarora0987@outlook.com");
        acc.set_amount(124567);

        //display
        System.out.println(acc.get_number()+ "\n" + acc.get_holder() + "\n" + acc.get_gmail() + "\n" + acc.get_amount());
 }   
}
