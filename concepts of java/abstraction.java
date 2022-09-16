import java.util.*;
abstract class login
{
    String username = "root", password = "pass";
    public abstract void login();
}
public class abstraction extends login
{
    public void login()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter username and Password: ");
        String uname = sc.next();
        String pass = sc.next();

        if(uname.equals(username) && pass.equals(password))
        {
            System.out.println("Welcome back ....!");
        }
        else 
        {
            System.out.println("Incorrect Username or Password...! ");
        }
    }
    public static void main(String args[])
    {
        abstraction ab = new abstraction();
        ab.login();
    }    
}
