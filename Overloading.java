class Overloading 
{
public static void main(String [ ]args){
    System.out.println(sum(5,7));
    System.out.println(sum(5,7,2));
    System.out.println(sum(5.2f,7));
    System.out.println(sum(5.3,7.5));


}   
static int sum( int a, int b){
    return a + b ;

} 
static int sum ( int a , int b , int c ){
    return a+b+c;

}
static float sum (float a , int b ){
    return a + b;

}
static double sum ( double a , double b){
    return a + b ;
}
}

