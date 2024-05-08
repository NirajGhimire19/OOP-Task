/*2. Write a program to calculate SI.*/
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {

      int amount , rate , time , si;
      Scanner scan = new Scanner(System.in);

      System.out.println("The Principal amount" );
      amount = scan.nextInt();

      System.out.println("Rate");
      rate = scan.nextInt();

      System.out.println("Time");
      time = scan.nextInt();

      scan.close();

      si = (amount*rate*time)/100;
      System.out.println("The Simple Interest is : " + si);
      

    }
    
}
