/* 1. Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote.*/
import java.util.Scanner;
public class q1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        
        if(age>=18) {
            System.out.println("Vote");
        
        }
        else{
            System.out.println("can't vote");
        }
        scan.close();
    }
}