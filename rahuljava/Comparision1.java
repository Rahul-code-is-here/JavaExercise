//package Mypractice1;

import java.util.Scanner;

public class Comparision1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        double a= sc.nextDouble();
        System.out.println("enter the value of b");
        double b= sc.nextDouble();

        if (a==b){
            System.out.printf( "%d == %d",a,b);
        }
        else if(a<b){
            System.out.printf("%d < %d",a,b);
        }
        else if(a>b){
            System.out.printf("%d>%d",a,b);
        }


    }
}
