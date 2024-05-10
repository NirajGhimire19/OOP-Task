//5. Write a JAVA program to check whether a year is a leap year or not.
import java.util.Scanner;
public class QN5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a year");
        int num = scan.nextInt();
        if(num % 4 == 0){
            System.out.println("it's a leap year");
        }else{
            System.out.println("it's not a leap year");
        }
        scan.close();
    }
}
