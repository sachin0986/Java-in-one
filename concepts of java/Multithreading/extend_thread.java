
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
 public class extend_thread extends Thread
 {
    //that run() method called automatically 
    public void run()
    {
        System.out.println("This is an example of extending the Thread class");
    }

    public static void main(String args[])
    {
        extend_thread et = new extend_thread();
        //when we start a Thread this run() method is called automatically
       // start() method is used to call thread 
        et.start();
    }
 }
