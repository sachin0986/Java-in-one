//you can set permissions according to your self by using some pre-defined functions().

import java.io.File;

public class permissions_file 
{
   public static void main(String args[])
   {
        File file = new File("D:\\created files\\rat.txt");
        
        boolean exists = file.exists();
        if(exists == true)
        {
            //setting the permissions if file path == true
            file.setExecutable(true);
            file.setReadable(true);
            file.setWritable(false);

            System.out.println("File Permission changed ");

            //printing all permissions that we set
            System.out.println("Executable: " + file.canExecute()+ "\n" + "Readable: " + file.canRead() + "\n" + "Writeable: " + file.canWrite());
        }

        else 
        {
            System.out.println("File not found");
        }
   } 
}
