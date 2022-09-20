import java.io.*;
import java.util.*;



public class r_WoutL_Sac 
{
    public static void main(String args[]) throws Exception
    {
        File read_without_loops = new File("D:\\created files\\file1.txt");

        Scanner sc = new Scanner(read_without_loops);
//the delimeter is used to match the pattern which the scanner class is currently using.
        sc.useDelimiter("\\Z");

        System.out.println(sc.next());
    }    
}
