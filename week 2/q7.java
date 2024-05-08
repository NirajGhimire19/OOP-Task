/*7. Take the name, roll number, and field of interest from the user and print in the format below: 
 * Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz.*/

 import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String name, interest;
        int roll;

        System.out.println("Enter Your Name: ");
        name = scan.nextLine();

        System.out.println("Enter Your Field of Interest: ");
        interest = scan.nextLine();

        System.out.println("Enter Your Roll Number: ");
        roll = scan.nextInt();

        System.out.println("Hey, my name is " +name+ " and my roll number is " +roll+". My field of interest are " +interest+".");
        
        
        scan.close();

    }
    
}
