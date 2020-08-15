/*
Create a method
 */

import javax.swing.*;
import java.util.Scanner;

public class Method_Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creating object to call method
        //if method is non static
        Method_Exercise5 obj = new Method_Exercise5();
        //calling the method method5
        obj.method5();
        obj.method5();

        System.out.print("Enter the number ::  ");
        int number = sc.nextInt();
        System.out.println("The number "+number+" is even : " + isEven(number));
    }

    public void method5() {
        System.out.println("------------Hello world------------");
    }

    /*
    Create a method isEven(int num1),
    which accept one argument of type int and return true if num1 is
    even.
     */

    public static boolean isEven(int num1) {
        boolean response = false;
        if (num1 % 2 == 0) {
            response = true;
        }
        else {
            response = false;
        }
        return response;
    }
}
