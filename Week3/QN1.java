//1. Write a JAVA program to find the maximum between three numbers.
public class QN1 {
    public static void main(String[] args) {
        int num1 = 22, num2 = 33, num3 = 10;
        if (num1 > num2 && num1 > num3){
            System.out.println("greatest num is "+num1);
        }
        if(num2 > num1 && num2 > num3){
            System.out.println("greatest num is "+num2);
        }
        if(num3 > num1 && num3 > num2){
            System.out.println("greatest num is "+num3);
        }
    }
}
