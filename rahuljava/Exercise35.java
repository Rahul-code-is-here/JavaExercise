import java.util.Scanner;
public class Exercise35 {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the total side of pollygonal");
        int n= sc.nextInt();
        System.out.println("enter the lenth of the pollygonal side");
        double s= sc.nextDouble();
        System.out.println("the area of the pollygonal is :" + (n*(s*s))/(4* Math.tan(Math.PI/n))); 
}
}