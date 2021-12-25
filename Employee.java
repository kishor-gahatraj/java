import java.util.*;
public class Employee {
    int id ;
    String name;
    
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter id ,name ");
        id = sc.nextInt();
        name = sc.next();

    }
    void ShowData()
    {
        System.out.println("Id:" + id + "\nName:" + name );

    }
    
}
 class Programmer extends Employee 
 {
     int salary ;
     void getdata()//overridden 
     {
         super.getdata();//calling getdata() of parent
         Scanner sc = new Scanner(System.in);
         System.out.println("enter salary");
         salary = sc.nextInt();
     }
     void ShowData()//overridden
     {
        super.ShowData();//calling showdata() of parent
        System.out.println("salary:" + salary);
     }
     public static void main(String args[]){
         Programmer p =new Programmer();
         p.getdata();
         System.out.println("****************");
         p.ShowData();
     }

}
