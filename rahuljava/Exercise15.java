import java.util.*;
public class Exercise15 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of a");
        int a= sc.nextInt();
        System.out.println("enter the value of b");
        int b= sc.nextInt();
        int temp;
        System.out.println("before swapping =" +a+ "and"  + b);
         temp = a;
         a=b;
         b = temp;
         System.out.println("after swapping =" +a+ "and" + b);


    }
}
