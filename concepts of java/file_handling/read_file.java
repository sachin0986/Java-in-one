//reading a file.

import java.io.*;
import java.util.*;

public class read_file 
{
    //throws is keyword and 
    public static void main(String args[]) throws Exception
    {
        FileReader fr = new FileReader("D:\\created files\\file1.txt");
//loop statement.
        int i;
        
        while((i = fr.read()) != -1)
        //printing all content in file
        System.out.print((char)i);
    }   
}
