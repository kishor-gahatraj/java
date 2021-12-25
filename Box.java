public class Box {
    private int l;
    private int b;
    private int h;
    public void setData(int x,int y, int z)
    {
        l = x;
        b = y;
        h = z;

    }
    public int findarea(){
        return l*b;

    }
    public int findvolume(){
        return l* b* h;

    }
}
    class BoxDemo {
        public static void main(String a[])
        {
            Box b = new Box();
            b.setData(5, 6, 7);
            int area = b.findarea();
            System.out.println("area of box=" + area);
            int vol = b.findvolume();
            System.out.println("volume of box = " + vol);


        }
    }
    


