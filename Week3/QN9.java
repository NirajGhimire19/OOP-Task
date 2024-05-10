/*3. Write a Java program that takes an integer input (1 to 12) representing a month
 and prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall)
 using a switch case. */
 import java.util.Scanner;
public class QN9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter num representing month (1 to 12)");
        int num = scan.nextInt();
        switch(num){
            case 1,2,3:
            System.out.println("winter");
            break;
            case 4,5,6:
            System.out.println("Spring");
            break;
            case 7,8,9:
            System.out.println("Summer");
            break;
            case 10,11,12:
            System.out.println("Fall");
            break;
        }scan.close();

    }
}
