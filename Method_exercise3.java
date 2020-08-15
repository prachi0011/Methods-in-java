import java.util.Scanner;

/*
In main method, ask the user to separately input three grades from 0 to 100.
Since these are grades they should be store as double values. Create a method
that will take as parameters these 3 grades and average these. The method then return
the answer to main method and the answer is display ot user.
 */
public class Method_exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter grade 1 : ");
        double grade1 = scan.nextDouble();
        System.out.print("Enter grade 2 : ");
        double grade2 = scan.nextDouble();
        System.out.print("Enter grade 3 : ");
        double grade3 = scan.nextDouble();
        double average_grade;
        average_grade = avgGrade(grade1, grade2, grade3);
        System.out.println("The average grade is : " + average_grade);
    }

    public static double avgGrade(double a, double b, double c) {
        return (a + b + c)/3;
    }
}
