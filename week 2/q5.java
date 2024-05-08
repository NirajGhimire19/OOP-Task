/*5. Write a program to take two integer inputs from the user and print the sum and product of them. */

import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int a, b, sum, product;

        System.out.println("Enter first integer: ");
        a = scan.nextInt();
        System.out.println("Enter second integer: ");
        b = scan.nextInt();

        sum = a+b;
        product = a*b;

        System.out.println("The Sum of two integers: " + sum);
        System.out.println("The Product of two integers: " + product);

        scan.close();
    }
    
}
