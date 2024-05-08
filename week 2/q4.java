/*4. Write the ternary operator for question no. 1 */

import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        String message = (age>=18) ?"You are eligible to Vote.":"You are not elligible to Vote.";

        System.out.println(message);
        scan.close();
    }
    
}
