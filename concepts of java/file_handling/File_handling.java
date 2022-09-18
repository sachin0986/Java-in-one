/*In file handling we use java.io file to handle input-output operations 
 the java.io file contains many methods like :-
 1) canExecute()
 2) canRead()
 3) canWrite()
 4) compareTo(file_pathname)
 5) createNewFile()
 6) createTempFile(String prefix, String suffix)
 7) Delete()
 8) equals(objects obj)
 9) exists()
 10) getAbsolutePath()
 11) list()
 12) getFreeSpace()
 13) getName()
 14) getParent()
 15) getParentFile()
 16) getPath()
 17) setReadonly()
 18) isDirectory()
 19) isFile()
 20) isHidden()
 21) length()
 22) listFile()
 23)mkdir()
 24) renameTo(File Dest)
 25) setExecutable(Boolean Executable)
 26) setReadable(Boolean readable)
 27) setReadable(Boolean readablee, owner only)
 28) setWriteable(Boolean writeable)
 29) toString()
 30) toURL()
*/

/* 1) In this program we accepts a file or directory named "form" 
 then the program will cheek if that file or directory physically 
 exsist or not and display properties.
  */
// code 

import java.io.*;
public class File_handling 
{
    public static void main(String args[]) throws IOException
    {

    File f = new File("C:\\Users\\sachin\\Desktop\\form.txt");

    if(f.createNewFile())
    {
        System.out.println("File Created " + "\n" + "Detalils are : ");
    }

    else
    {
        System.out.println("ERROR to create file..!");
    }
    System.out.println("Filee name: " + f.getName());
    System.out.println("Path: " + f.getPath());
    System.out.println("Absolute path: " + f.getAbsolutePath());
    System.out.println("Parent: " + f.getParent());
    System.out.println("Exists: " + f.exists());

    if(f.exists())
    {
        System.out.println("Is writeable: " + f.canWrite());
        System.out.println("Is readable: " + f.canRead());
        System.out.println("Is a Directory: " + f.isDirectory());
        System.out.println("File size in bytes: " + f.length());
    }

    else
    {
        System.out.println("ERROR....!" + "\n" + "Make sure the details you entered in code is correct.");
    }
    }
}
