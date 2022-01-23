package T2;

import java.util.Scanner;

public class T2Q2 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("The average of "+a+" "+b+" "+c+" is "+(a+b+c)/3);
    }
}
