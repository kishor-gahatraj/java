import java.util.*;


public class Multiarray {
   public static void main (String args[])
   {
       int a[][] = new int[3] [3]; // declaration and instantiation 
       Scanner sc = new Scanner (System.in);
       System.out.println("enter element");
       for (int i = 0 ; i<3; i++)
       for (int j = 0 ; j< 3 ; j++)
       a[i][j] =sc.nextInt();

       System.out.println("------------enter elements are ---------\n");
       for(int i = 0; i<3 ; i++)
       {
           for(int j = 0 ; j < 3 ; j++)
           {
               System.out.print(a[i][j]+" ");

           }
           System.out.println();
        

       }

   } 
}
