
package Multithreading;
/*Multithreading : It is a process to execute multiple threads simultaneously
   -> It improves the responsiveness of system
    *Threads : It is a light-weight sub-process or a smallest unit of processing
    -> Threads are indepandent
    -> If exception occurs in one thread then it will not affect the other threads
    
    *Process: Every function/ Method we create is a process

    Ways to creating Threads
    1) By extending a Thread class
    2) By implementing Runnable interface

 */

//Thread is a inbuilt class in java 
import java.util.*;
 public class extend_thread extends Thread
 {
    //that run() method called automatically
    
    //making this run() method comment for the multiThread execution
    //public void run()
    //{
    //    System.out.println("This is an example of extending the Thread class");
    //}



    //Like multiple inheritance there is "Multi-Threads" or multiple-threads 
    String process;
    int nop;

    Scanner sc = new Scanner(System.in);


    void getdata()
    {
        
        System.out.println("Enter the process:");
        process = sc.next();
        System.out.println("Enter the number of pages alloted to that process: ");
        nop = sc.nextInt();
    }

    public void run()
    {
        for(int i=1; i<=nop; i++)
        {
            System.out.println("Process: " + process +  " "  + "Pages: " + i );
        }
    }
    public static void main(String args[])
    {
        extend_thread et = new extend_thread();
        //when we start a Thread this run() method is called automatically
       // start() method is used to call thread 
        //et.start();

        //making objects for the both getData() and run() methods 
        extend_thread et1 = new extend_thread();
        extend_thread et2 = new extend_thread();

        //taking both process and pages by user 
        et1.getdata();
        et2.getdata();

        //printing both by the run() method 
        et1.start();
        // use this sleep function to make a dilay/time-gap/pause between the proces 1 & process 2
        try{
        et1.sleep(4000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        et2.start();
    }
 }
