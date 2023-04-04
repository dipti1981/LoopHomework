import java.util.Scanner;

//create a class to calculate the sum of series
public class Calculate {

    public static void main(String[] args) {

        //create a scanner class so user can input
        Scanner scanner = new Scanner(System.in);
        //acknowledge the user what to enter
        System.out.println("Enter any number: ");
        //storing variable using scanner object
        double num = scanner.nextDouble();
        double total = 0;


        System.out.print("Sum of series is: ");
        //using for loop for sum of fraction series
        for (int i = 1; i <=num ; i++) {
            total += 1.0/i;

        }
        System.out.println(total);
    }
}
