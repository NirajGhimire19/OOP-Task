//3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
import java.util.Scanner;
public class QN3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(("enter a number"));
        int num = scan.nextInt();
        if(num % 5 == 0 && num % 11 == 0){
            System.out.println("it is divisible by 5 and 11");
        }else{
            System.out.println("not divisible");
        }
    scan.close();
    }
    
}
