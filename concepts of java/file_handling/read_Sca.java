//reading a file using Scanner calss 
import java.io.*;
import java.util.*;

public class read_Sca 
{
    public static void main(String args[]) throws Exception
    {
        File read_scanner = new File("D:\\created files\\file1.txt");

        Scanner sc = new Scanner(read_scanner);
//this hasnextLine() is used to cheek there is a another line in the input of this scanner 
        while (sc.hasNextLine())
        //this method can read the input till the end of the line.
        System.out.println(sc.nextLine());
    }
}
