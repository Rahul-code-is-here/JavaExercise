import java.util.*;
public class Exercise32 {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first num1");
        int num1=sc.nextInt();
        System.out.println("enter the second num2");
        int num2=sc.nextInt();

        if (num1==num2){
            System.out.printf("%d == %d",num1,num2);
        }
        else if (num1!=num2){
            System.out.printf("%d != %d",num1,num2);
        }
        else if (num1<num2){
            System.out.printf("%d < %d",num1,num2);
        }
}
}