//code to implement the super keyword with variables 

package keywords;

class maximu 
{
    int max = 300;  //variable of Super-class
} 


 class max_im extends maximu
 {
    int max = 400;  //variable of Sub-class 

    void show()
    {
        //using the super keyword we can access the super calls variable 
         
        System.out.println("max = " + super.max);
    }
 }


 public class Super_Variables
 {
 public static void main(String args[])
 {
    max_im im = new max_im();
    im.show(); 
 }
}
