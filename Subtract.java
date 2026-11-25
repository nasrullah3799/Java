package Myjava;
import java.util.Scanner;
import java.util.InputMismatchException;
class Subtract{
    public void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter the number-1:");
            float a = sc.nextFloat();
            
            System.out.print("Enter the number-2:");
            float b = sc.nextFloat();
            
            float subtract = a-b;
            System.out.println("The ans is "+ subtract);
            sc.close();
        }
        catch (InputMismatchException e){
            System.out.println("Error!\n please enter valied number.");
        }
    }
}
