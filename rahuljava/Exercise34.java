import java.util.*;
public class Exercise34 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the lenth of side ");
        double s= sc.nextDouble();
        System.out.println("the are of hexagonal is" +( 6*(s*s))/(4*Math.tan(Math.PI/6)));
    }
}
