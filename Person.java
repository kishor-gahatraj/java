public class Person {
    String name;
    int age ;
    Person(String name , int age )
    {
        this.name =name ;
        this.age = age ;

    }
    Person(){


    }
    boolean compareAge(Person p)
    {
        if(this.age > p.age)
        return true;
        else
        return false;
    }
    Person min (Person p)
    {
        if (this.age< p.age)
        return this;
        else
        return p;

        
    }
}
class Persondemo {
    public static void main(String a[])
    {
        Person p1 =new Person("kishor", 23);
        Person p2 =new Person("aakash", 26);
        boolean flag = p1.compareAge(p2);
        if(flag)
        System.out.println("p1 is elder");
        else 
        System.out.println("p1 is smaller" );
        Person p = new Person();
        p = p1.min(p2);
        System.out.println("Age of brother is ::"+ p.age);

    }
}
    

