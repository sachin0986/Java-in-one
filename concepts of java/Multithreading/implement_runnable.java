package Multithreading;

// by this runnable interface we can perform the thread implementation to multiple files

public class implement_runnable implements Runnable
{
   public void run()
   {
    System.out.println("This is an example of implementing Runnable interface");

   }   

   public static void main(String args[])
   {
        implement_runnable ir = new implement_runnable();
        //assigning the object "ir" to thread
        Thread t = new Thread(ir);
        //t is a thread object by this we can call the start() method 
        t.start();
   }
}
