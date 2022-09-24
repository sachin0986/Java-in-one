/*There are some states of thread in java basiclly it called as a life cycle of a thread
    New 
    Runnable
    Running
    Waiting
    Timed_Wating
    Terminated 
 */

package Multithreading;

public class thread_states implements Runnable
{
    public void run()
    {
        //Moving thraed 2 to timed_waiting state 
        try
        {
            Thread.sleep(1500);
        }    
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("State of thread 1 while it called join() method on thread 2 - " + Test.thread1.getState() );

        try
        {
            Thread.sleep(200);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        
    }

}

        class Test implements Runnable
        {
            public static Thread thread1;
            public static Test obj;


            public static void main(String args[])
            {
                obj = new Test();
                //when we assign/pass the object to a thread that means it's created 
                thread1 = new Thread(obj);

                //Thread 1 created and it's currently in the new state 
                System.out.println("State of thread 1 after creating it - " + thread1.getState());
                //by calling start() method the thread1 moves in runnable state 
                
                thread1.start();

                //Thread 1 moves to runnable state 
                System.out.println("State of thread 1 after calling start() method on it - " + thread1.getState());

                try {
                    thread1.join();
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }

                System.out.println("State of thread 1 when it has finished it's execution - " + thread1.getState());

            }
            public void run() 
            {
                thread_states myThread = new thread_states();
                Thread thread2 = new Thread(myThread);
                //Thread 2 created and it's currently in the new state

                System.out.println("State of thraed 2 after creating it -  " + thread2.getState());

                //by calling start() method the thread 2 moves in runnable state

                thread2.start();
                
                //Thread 2 moves to runnable state

                System.out.println("State of thread 2 after calling start() method on it - " + thread2.getState());

                try 
                {
                    //moving thread 2 to Timed_Waiting state 
                    Thread.sleep(200);        
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }

                System.out.println("State of thread 2 after calling .sleep() method on it - " + thread2.getState() );

                try 
                {
                    //waiting for thread 2 to die/ Terminated
                    thread2.join();    
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }

                System.out.println("State of thread 2 when it has finished it's execution - " + thread2.getState());

               
            }
        }
