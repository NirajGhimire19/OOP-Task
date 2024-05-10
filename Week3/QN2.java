//2. Write a JAVA program to check whether a number is negative, positive, or zero.

import java.util.Scanner;

public class QN2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        if(num < 0){
            System.out.println("-ve num");
        }
        if(num == 0){
            System.out.println("Zero");
        }
        if(num > 0){
            System.out.println("+ve num");
        }
        scan.close();
    }
}
