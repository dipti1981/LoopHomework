import java.util.Scanner;

//create a class to calculate two numbers
public class Calculator {

    public static void main(String[] args) {

        //create a scanner class so user can input
        Scanner scanner = new Scanner(System.in);
        //acknowledge the user what to enter
        System.out.println("Enter first number: ");
        //storing variable using scanner object
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        //storing variable using scanner object
        double num2 = scanner.nextDouble();
        System.out.println("Enter any one of following operator(+, -, *, /): ");
        //storing variable using scanner object
        String symbol = scanner.next();


        //using switch to find out calculation of two numbers
        switch (symbol){
            case "+":
                System.out.println("sum of first and second number is: " + (num1+num2));
                break;
            case "-":
                System.out.println("Subtraction of first and second number is: " + (num1 - num2));
                break;
            case "*":
                    System.out.println("Multiplication of first and second number is: " + (num1 * num2));
                  break;
            case "/":
                System.out.println("Division of first and second number is: " + (num1 / num2));
        }

    }
}
