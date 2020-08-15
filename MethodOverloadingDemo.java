import java.util.Scanner;

/*
Create a method, which accept two integer arguments
and create another method with same same name, which accept three arguments, to demonstrate
method overloading
 */
public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers...");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        //creating MethodOverloadingDemo object
        MethodOverloadingDemo object = new MethodOverloadingDemo();

        int result1 = object.add(num1, num2);
        System.out.println("The sum of num1 and num2 : " + result1);

        int result2 = object.add(num1, num2, num3);
        System.out.println("The sum of all three numbers : " + result2);

        System.out.println("Double add method output");
        System.out.println(object.add(2.0, .9));
    }
    public int add(int a, int b) {
        System.out.println("2 integer arguments");
        return a+b;
    }
    public int add(int x, int y, int z) {
        System.out.println("3 integer arguments");
        return x+y+z;
    }

    public double add(double a, double b) {
        System.out.println("2 double arguments");
        return a+b;
    }
}
