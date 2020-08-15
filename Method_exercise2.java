import java.util.Scanner;

/*
In main method, ask user to separately input two integers from 1 to 100. Store the user input into variables.
Create a method that will take as parameters these two values and determine which one is the larger number.
The method will then return the larger of two numbers and display answer to user.
 */
public class Method_exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.print("Enter the first number  : ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number  :  ");
        int num2 = scan.nextInt();
        System.out.println();
        number = largerNum(num1, num2);

        System.out.print("Larger of two numbers is : "+ number);
    }
    public static int largerNum(int a, int b) {
            int larger = 0;
        if (a >= b) {
            return larger;
        }
        else {
            return larger;
        }

    }
}
