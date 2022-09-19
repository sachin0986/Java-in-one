//Program to take input of file name, location to store that file & extension of that file 

import java.io.*;
import java.util.*;


public class create_file 
{
       public static void main(String args[])
       {
         create_file cf = new create_file();
         cf.newFile();
       }

       void newFile()
       {
        String Fpath = "", Fname = "", extension = "";

        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter File name: ");

            Fname = sc.next();

            System.out.println("Enter the File path where you wanna store that: ");
            Fpath = sc.next();


            File file1 = new File(Fpath + " " + Fname + " ");

            file1.createNewFile();

        }
        catch(Exception ex1){}
       }
}
