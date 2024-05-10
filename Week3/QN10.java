/*4. Implement a Java program that calculates the area of different shapes 
(circle, rectangle, square, triangle) based on the user's choice using 
a switch case.*/
import java.util.Scanner;
public class QN10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter shape");
        String shape = scan.nextLine();
        switch(shape){
            case "Circle":
            System.out.println("Enter radious in meter");
            double rad = scan.nextDouble();
            System.out.println("the area of circle is " +(3.14*rad*rad));
            break;
            case "Rectangle":
            System.out.println("Enter length");
            double len = scan.nextDouble();
            System.out.println("Enter length");
            double bre = scan.nextDouble();
            System.out.println("the area of rectangle is " +(len*bre));
            break;
            case "Square":
            System.out.println("Enter length");
            double len1 = scan.nextDouble();
            System.out.println("the area of rectangle is " +(len1*len1));
            break;
            case "Triangle":
            System.out.println("Enter base");
            double base = scan.nextDouble();
            System.out.println("Enter height");
            double height = scan.nextDouble();
            System.out.println("the area of rectangle is " +(0.5*base*height));
            break;
            default:
            System.out.println("invalid shape");
            break;
        }scan.close();
    }
}
