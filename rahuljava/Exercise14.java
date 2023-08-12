import java.util.*;
public class Exercise14 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a\n");
        int a= sc.nextInt();
        System.out.println("enter the value of b\n");
        int b= sc.nextInt();
        System.out.println("before swapping:" + a + "and " + b);
        a = a+b;
        b= a-b;
        a= a-b;
        System.out.println("after swapping value is " + a + " and " + b);

}
}