import java.util.Random;

/*
Write a method that will simulate the results of two rolling fair dice by printing
two random integers values in the range 1 to 6 along with their sum.
Sample output from a call to the method could be.
 */
public class Method_Exercise4 {
    public static void main(String[] args) {
        rollDice1();
        System.out.println();
        rollDice2();
    }

    public static void rollDice1() {

        int a = (int)(Math.random()*6)+1;
        int b = (int)(Math.random()*6)+1;

        System.out.println("Numbers are " +a+ " and " +b);
        System.out.println("the total of a and b is " + (a+b));
    }
//using random class
    public static void rollDice2() {
        Random r = new Random();
        int a = r.nextInt(6)+1;
        int b = r.nextInt(6)+1;

        System.out.println("Two random numbers are : "+ a + " " + b);
        System.out.println("The total of a and b : " + (a+b));
    }
}
