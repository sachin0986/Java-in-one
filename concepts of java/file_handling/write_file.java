//methods to write in file
// 1) writeString() method 


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class write_file
{
    void writeWithString() throws IOException
    {
        String text = "Welcome to writeString() method ";

        Path fileName = Path.of("D:\\created files\\basic.txt");
            //to push/write the data in file.
        Files.writeString(fileName, text);

            //to read the file content what you push in it. 
        String file_content = Files.readString(fileName);

        System.out.println(file_content);

    } 
    
    

    public static void main(String args[]) throws IOException 
    {
        write_file wf = new write_file();
        wf.writeWithString();
    }
}
