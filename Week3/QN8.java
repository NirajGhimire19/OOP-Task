/*2. Create a Java program that takes two numbers and an operator (+, -, *, /) as
 inputs and performs the corresponding arithmetic operation using a switch case statement. */
 import java.util.Scanner;
public class QN8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 1st number");
        int num1 = scan.nextInt();
        System.out.println("enter 2nd number");
        int num2 = scan.nextInt();
        System.out.println("enter operator");
        char opt = scan.next().charAt(0);
        switch(opt){
            case '+':
            System.out.println("sum is "+(num1 + num2));
            break;
            
            case '-':
            System.out.println("difference is "+(num1 - num2));
            break;

            case '*':
            System.out.println("multiple is "+(num1 * num2));
            break;

            case '/':
            System.out.println("quosient is "+(num1 / num2));
            break;

            default:
            System.out.println("Invalid Operator");
            break;

        }scan.close();

    }
}
