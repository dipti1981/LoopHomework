import java.util.Scanner;

//create a class to display n limit of natural number and their sum
public class Natural_Number2 {

    public static void main(String[] args) {
        //create a Scanner class so user can input
        Scanner scanner = new Scanner(System.in);
        //acknowledge the user what to enter
        System.out.println("Enter any natural number:" );
        //storing variable using scanner object
        int num = scanner.nextInt();
        int total = 0;
        System.out.print("Display of natural number: " );

        for (int i = 1; i <= num ; i++) {
            System.out.print(i + ", ");
            total = total + i;


        }
        System.out.print("\nSum of natural number is: " + total);

    }
}


