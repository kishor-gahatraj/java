import java.util.Arrays;
public class arrayclass {
    public static void main(String [] args)
  {
      int a []= {1,2,3,4,5,6};
      int b []=new int [5];

      int pos = Arrays.binarySearch(a,5);
      System.out.println("index of 5 is : "+ pos);

      boolean flag = Arrays.equals(a,b);
      System.out.println("Are a and b equal:" + flag);

      System.arraycopy(a,0,b,0,5);
      System.out.println("************elements of b are=************");

      for (int i= 0; i<5;i++)
      {
          System.out.print(b[i]+" ");

      }
      System.out.println();
      Arrays.sort(a);
      System.out.println("after sorting :");
      for(int i=0;i<5;i++)
      {
          System.out.print(a[i]+" ");

      }
  }  
}
