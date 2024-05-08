/*8. Take side of a square from user and print area and perimeter of it. 
Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid.
 Take the attributes as user input */

 import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);


       // Area and Perimeter of Square:

        System.out.println("Enter the length of side: ");
        int side = scan.nextInt();
         int area = side*side;
         int perimeter = 4*side;
         System.out.println("The are of Square is " +area+ "The Perimeter of Square is " +perimeter);
         
         //Simple Interest:
         
      System.out.println("The Principal amount" );
      int amount = scan.nextInt();

      System.out.println("Rate");
      int rate = scan.nextInt();

      System.out.println("Time");
      int time = scan.nextInt();

      

      int si = (amount*rate*time)/100;
      System.out.println("The Simple Interest is : " + si);

      //Area of Triangle:

      System.out.println("Breadth");
      int breadth = scan.nextInt();
      System.out.println("height");
      int height = scan.nextInt();
      int areaTriangle = (breadth*height)/2;
      System.out.println("The Area of Triangle is " +areaTriangle);

      //Volume of Cuboid Cube:

      System.out.println("The length is");
      int length = scan.nextInt();
      
      System.out.println("The width is ");
      int width = scan.nextInt();

      System.out.println("The height is");
      int Theight = scan.nextInt();

      int volume = length*Theight*width;
      System.out.println("The Volume of Cuboid is :" +volume);


      //Volume ofCube:

      System.out.println("side");
      int CSide = scan.nextInt();

      int Carea = CSide*CSide*CSide;
      System.out.println("The volume of Cube is :" + Carea);

      
      scan.close();


    }
    
}
