// normally doing all function in file 
// like:- create, read, delete, write  

import java.util.*;
import java.io.*;


public class read_all 
{

    public void Createfile()
    {
        File myfile = new File("D:\\created files\\basic.txt");
        try{
        if(myfile.createNewFile())
        {
            System.out.println("File created Successfully..");
        }
        else
        {
            System.out.println("ERROR File can't be Created...!");
        }
    }
    catch(IOException E)
    {
        E.printStackTrace();
    }
    }

    void write_in_file() 
    {
        try{
        FileWriter fw = new FileWriter("D:\\created files\\basic.txt");
        fw.write("Hii gyus");
        fw.close();
        System.out.println("File written Successfully...");
    }
    catch(IOException E)
    {
        E.printStackTrace();
    }

    }

    //now taking input from user in file.

    void read_file()
    {
        try
        {
            FileReader fr = new FileReader("D:\\created files\\basic.txt");
            Scanner s = new Scanner (fr);
            while(s.hasNextLine())
            {
                String str = s.nextLine();
                System.out.println(str);
            }
            fr.close();
             
            System.out.println("File readed successfully...!");
        }
        catch(IOException E)
        {
            E.printStackTrace();
        }
    }

    void delete_file()
    {
        File fd = new File("D:\\created files\\basic.txt");
        if(fd.delete())
        {
            System.out.println("File Deleted Successfully...!");
        }

        else 
        {
            System.out.println("ERROR... Cheek the you enterEd ");
        }
    }
  public static void main(String args[]) 
  {
   read_all rll = new read_all();
   //rll.Createfile();
   //rll.write_in_file();
   //rll.read_file();
   rll.delete_file();
  }  
}

