package Myjava;
import java.util.InputMismatchException;
import java.util.Scanner;

public class add {
    public static void main(String[] args){
        try {
            Scanner sc= new Scanner(System.in);
            
            System.out.print("Enter The number-1:");
            float a = sc.nextFloat();
            
            System.out.print("Enter The number-2:");
            float b = sc.nextFloat();
            
            float add = a+b;
            System.out.println("The ans is "+add);
            sc.close();
        }
        catch (InputMismatchException e){
            System.out.println("Error: please enter valid input(like integar or float)!");
        }
    }
}
