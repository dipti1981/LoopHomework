import java.util.Scanner;

//create a class to print the sum of x ranging from 1 to 120
public class Print_Sum {

    public static void main(String[] args) {

        //create a Scanner class so user can input
        Scanner scanner = new Scanner(System.in);
        //acknowledge the user what to enter
        System.out.println("Enter a start number between 1 to 20: ");
        //storing variable using scanner object
        int num1 = scanner.nextInt();
        //acknowledge the user what to enter
        System.out.println("Enter a end number between 1 to 20: ");
        //storing variable using scanner object
        int num2 = scanner.nextInt();
        int total = 0;
        System.out.print("Sum of given range is: ");

        for (int i = num1; i <=num2 ; i++) {
            total+=i;

        }
        System.out.println(total);
    }
}
