//Multiplication of two numbers using Java Methods
public class pt2{
    public static int prod(int a, int b){
        int mul = a*b;
        return mul;
    }
    public static void main(String[]args){
       int multi = prod(23, 2);
       System.out.print("Product: " + multi);
    }
}