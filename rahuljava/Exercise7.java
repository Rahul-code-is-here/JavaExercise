import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of num.");
        int num=sc.nextInt();

        for(int i=0; i<10; i++){
            System.out.println(num + "x" + (i+1) +  "=" + (num*(i+1)));
        }

}
}
