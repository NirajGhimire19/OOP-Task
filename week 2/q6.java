/*6. Take two integer inputs from the user. First, calculate the sum of two, then the product of two. 
 * Finally, calculate the division of the thus obtained sum and product and print the result.
 */

import java.util.Scanner;
public class q6 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int a,b,sum,product,division;

        System.out.println("Enter first integer: ");
        a = scan.nextInt();
        System.out.println("Enter second integer: ");
        b = scan.nextInt();

        sum = a+b;
        product = a*b;

        division = product/sum;
        System.out.println("The Division of product and sum are: " +division);

        scan.close();


    }
}