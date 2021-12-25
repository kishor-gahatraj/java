public class Rectangle {
    private int length ;
    private int breadth ;

    public Rectangle()
    {//default constructor 
        length = 4;
        breadth = 1;


    }
    public Rectangle( int l , int b)
    {//parameterized constructor
        length = l;
        breadth = b;


    }
    int findarea()
    {
        return length * breadth ;

    }
    int findperimeter()
    {
        return 2 *(length + breadth);

    }
    
}

class MainRectangle 
{
    public static void main (String [] args)
    {
        Rectangle rect1 = new Rectangle(10,5);
        Rectangle rect2 = new Rectangle();
        System.out.println("first rectangle");
        System.out.println("area:" +rect1.findarea());
        System.out.println("perimeter:" +rect1.findperimeter());
        System.out.println("second rectangle");
        System.out.println("area:" +rect2.findarea());
        System.out.println("perimeter:" +rect2.findperimeter());


    }
}
