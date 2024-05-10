//6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
import java.util.Scanner;

public class QN6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a letter");
        String ch = scan.nextLine();
        ch = ch.toLowerCase();
        
        if (ch == "a" || ch == "e" || ch == "i" || ch == "o" || ch == "u"){
            System.out.println("its a vowel");
        }else{
            System.out.println("it's consonant");
        }
        
        scan.close();
    }
}
