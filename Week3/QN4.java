//4. Write a JAVA program to check whether a number is even or odd.
import java.util.Scanner;
public class QN4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scan.nextInt();
        if(num == 0){
            System.out.println("enter a non-zero number");
        }
        else if(num % 2 == 0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
        scan.close();
    }
    
}
