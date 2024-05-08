/*3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.*/
/*Volume of Cuboid = length*width*height
 Volume of Cube: side*side*side*/

 import java.util.Scanner;
 public class q3 {
    public static void main(String[] args) {
        
        int length, width, height, volume;
        Scanner scan = new Scanner(System.in);

        System.out.println("The length is");
        length = scan.nextInt();
        
        System.out.println("The width is ");
        width = scan.nextInt();

        System.out.println("The height is");
        height = scan.nextInt();

        volume = length*height*width;
        System.out.println("The Volume of Cuboid is :" +volume);



        int side, area;

        System.out.println("side");
       side = scan.nextInt();

        area = side*side*side;
        System.out.println("The volume of Cube is :" + area);
        
        scan.close();
    }
 }

