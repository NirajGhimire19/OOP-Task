/*1. Write a Java program that takes a student's grade as input (A, B, C, D, or F)
 and converts it to the corresponding GPA value. Use a switch case statement to handle
 different grades*/
import java.util.Scanner;
public class QN7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your grade");
        char ch = scan.nextLine().toLowerCase().charAt(0);
        switch(ch){
            case 'a':
            System.out.println("more than 4 GPA");
            break;
            case 'b':
            System.out.println("more than 3 GPA");
            break;
            case 'c':
            System.out.println("more than 2 GPA");
            break;
            case 'd':
            System.out.println("more than 1 GPA");
            break;
            case 'e':
            System.out.println("more than 0 GPA");
            break;
            case 'f':
            System.out.println("fail");
            break;

        }scan.close();
      }
}
