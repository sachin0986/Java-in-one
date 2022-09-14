//Single dimentional array with user input and printing with for loop 

import java.lang.*;
import java.util.*;

class arrayID{



void BasicArr()
{
    int i;
int intArray[] = {23,45,78,97,56};
    intArray = new int[5];

for(i = 0; i< intArray.length; i++)
{
System.out.println("Array element = " + intArray[i]);
}

}

void foreach()
{
    int array[] = {1,5,8,9,4};
    for(int element: array)
    {
        System.out.println("elements are = " + element);
    }
}

void userArr()
    {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements you wants to store: ");
        n = sc.nextInt();
        int array1[] = new int[100];
        System.out.println("Enter Elements for Array: ");
        for(i = 0; i < n; i++)
        {
            array1[i] = sc.nextInt();
        }

        System.out.println("Elements are : ");
        for(i = 0; i<n; i++)
        {
            System.out.println(array1[i]);
            //System.out.println("Indexing of Elements: " + array1[i] + "is" + i);
        }

      

        

    }


    void me()
    {
        int num,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Length: ");
        num = sc.nextInt();

        int Sac[] = new int[100];

        System.out.println("Enter Elements for Array: ");
         for(i = 0; i<num; i++)
         {
            Sac[i] = sc.nextInt();
         }

         System.out.println("The elements you enter are shown blow: ");
         for(i = 0; i< num; i++)
         {
         System.out.println("Element at Index = "+ i + " " + "is" + " " + Sac[i] );
         }
    }

    // Multi-Dimential Array


    

    void basic2d()
    {
        int i, j;
        int twod[][] = {{1,3,6,7}, {3,8,7,9}};
        for(i = 0; i<4; i++)
        {

            for(j = 0; j < 4; j++)
            {
                System.out.print(twod[i][j] + " ");
            }
        System.out.println();
        }
    }

    void Input2d()
    {
        int i,j,r,c,k;
        int first[][] = new int[100][100];
        int second[][] = new int[100][100];
        int mul[][] = new int[100][100];
        System.out.println("Enter the rows and columns for array : ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
//taking values
        System.out.println("Enter 1st array values : ");
            for(i = 0; i < r; i++)
            {
                for(j = 0; j < c; j++)
                {
                    first[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter elements for 2nd array : ");
            for(i = 0; i < r; i++)
            {
                for(j = 0; j < c; j++)
                {
                    second[i][j] = sc.nextInt();
                }
            }

            //displaying

            System.out.println("Values of 1st array : ");
            for(i = 0; i < r; i++)
            {
                for(j = 0; j<c; j++)
                {
                    System.out.print(first[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Values of 2nd array : ");
            for(i = 0; i < r; i++)
            {
                for(j = 0; j < c; j++)
                {
                    System.out.print(second[i][j] + " ");
                }
                System.out.println();
            }
//S ome complication with logic of multiplycation
            System.out.println("Multiplycation is : ");
            for(i = 0; i < r; i++)
            {
                for(j = 0; j < c; j++)
                {
                    mul[i][j] = 0;
                    //hard to understand why we ue that k and the indexig
                    for(k = 0; k < r; k++)
                    {
                        mul[i][j] += first[i][k] * second[k][j];
                    }

                    System.out.print(mul[i][j] + " ");
                }
                System.out.println();
            }

            

            

    }


    //by this we can add different columns in different rows
    
    /*void jagged()
    {
        int i,j,row,c1,c2;
        int jag[][] = new int[2][];

        System.out.println("Enter rows : ");
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        System.out.println("Enter columns or row1: ");
        c1 = sc.nextInt();
        System.out.println("Enter columns or row2: ");
        c2 = sc.nextInt();

        for(i = 0; i < row; i++)
        {
            for(j 0; j< )
                jag[i][c1];
                jag[i][c2];
        }
        for(i = 0; i < row; i++)
        {
            
        }

    }*/


    void finalArray()
    {
        /* we cant change the value of variables when we using final key word but we can change 
        the objects whether we are using final key word  */

         final int p[] = {1,2,50,5};
        p[2] = 3; 

            for(int i = 0; i< p.length; i++)
            {
                System.out.println("Array with changed values = " + p[i]);
            }
    }


    
public static void main(String args[])
{
    arrayID arr = new arrayID();
    //arr.BasicArr();
    //arr.foreach();
    //arr.userArr();
    //arr.me();
    //arr.basic2d();
    //arr.Input2d();
    arr.finalArray();
}
}



