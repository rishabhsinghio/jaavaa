//Factorial using methods
public class pt3{
    public static int fact(int num){
        int b = 1;
        for(int i = 1; i < num; i++){
            int a = num - i;
            b = b * a;
        }
        int c = num * b;
        return c;
    }
    public static void main(String[]args){
        int number = fact(5);
        System.out.print(number);
    }
}