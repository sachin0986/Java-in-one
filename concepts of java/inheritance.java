import java.util.*;
import java.lang.*;
import java.io.*;

// Access Modifiers
// 1.Default
// 2.public
// 3.protected
// 4.private


/*class dis
{
    void display()
    {
        System.out.println("hii");
    }


}*/


//inheritance
// 1) single level

 class one
{
    String  f_name;
        public void print_Firstname()
        {
            Scanner s = new Scanner(System.in);
            f_name = s.next();
        
        }
}
//sub class = two & super class = one; sub <= super ;
    class two extends one
    {
        String l_name;
        public void print_Lastname()
        {
           Scanner s = new Scanner(System.in);
           l_name = s.next(); 
            
        }
    
    
// always remember make a method in a class;
      void display()
    {
        System.out.println("First name of user is = " + f_name);
        System.out.println("Last name of user = " + l_name);
    }
}

//2) Multi level

  class name
  {
    String na;
    public void u_name()
    {
        System.out.println("Enter your name : ");
        Scanner s = new Scanner(System.in);
        na = s.next();
    } 
  }

  class age extends name
  {
    int ag;
    public void u_age()
    {
        System.out.println("Enter your age : ");
        Scanner s = new Scanner(System.in);
        ag = s.nextInt();
    }
  }
class Nationality extends age
{
    String nation;
    public void u_Nationality()
    {
        System.out.println("Enter your Nationality");
        Scanner s = new Scanner(System.in);
        nation = s.next();
    }

    void display1()
    {
        System.out.println("Details enter by user are:");
        System.out.println(na);
        System.out.println(ag);
        System.out.println(nation); 
        
    }
}


//3) hierarehical 

class input 
{
    void user1()
    {
        System.out.print("Scahin's");
    }
}

class Subj extends input
{
    void subject()
    {   
    System.out.println(" " + "fav subject is computer");
    }
}

class Sport extends input
{
    void game()
    {
        System.out.println(" " + "Fav sport is Table Tennis");
    }
}



//4) Mutiple
// first u need to understand interface :-
    // Interface 

    interface In1
    {
        //note : abstract method do not specifly body => i use void num() to put the value of a in it.
    
        
         final int an = 10;
        

        public void show();
    }
// implements keyword is used to inherit the "In1" interface in class "test"

    class test implements In1
    {
         public void show()
         {
            System.out.println("sachin");
         }
    }




//for interface u have to make the dicleration/body "{  }" of methods in last class..

// for interface only i have to comment that opps class ..!  once


// >> back to line number 128 . 4) multiple inheritance


//> start fro here-
interface name_u
{
    void n_u();
}

interface age_u
{
    void a_u();
}

interface class_u extends name_u, age_u
{
    void c_u();
}
//for interface u have to make the dicleration/body "{  }" of methods in last class..
class multiple1 implements class_u
{
    public void n_u() 
    {
        System.out.println("Sachin ");    
    }

    public void a_u() 
    {
        System.out.println("19");    
    }

    public void c_u() 
    {
        System.out.println("BCA");
    }
}

  //5) Hybrid Inheritance  

//main class name "opps"
    class inheritance 
{
    public static void main(String args[])
    {
        // make a object of last class what u named it.
        //two t = new two();
        //t.print_Firstname();
        //t.print_Lastname();
        //t.display();
        //Nationality nat = new Nationality();
        //nat.u_name();
        //nat.u_age();
        //nat.u_Nationality();
        //nat.display1();
        
    //creating object of class Subj 
        //Subj sub = new Subj();
        //sub.user1();
        //sub.subject();

    //creation object of class sports 
        //Sport sp = new Sport();
        //sp.user1();
        //sp.game();

        //making the object for interface concept 

        //test t = new test();
        //t.show();
        //System.out.println(an);

    // multiple inheritance

    multiple1 mt = new multiple1();
    mt.n_u();
    mt.a_u();
    mt.c_u();


    }
}
    

