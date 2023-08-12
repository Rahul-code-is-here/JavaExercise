import java.util.*;

public class Exercise122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt(0);
        int n1 = n;
        int count = 0;

        while (n != 0) {
            // this i because number of trailling 0 is denoted by factors of 5
            count = count + n1 / 5;
            n1 = n1 / 5;

        }
        System.out.println("the number of trailling 0 in n1 factorial is:" + count);
    }
}