import java.util.Scanner;

//create a class to find out sum of natural number
public class Natural_Number {


    public static void main(String[] args) {

        //create a Scanner class so user can input
        Scanner scanner = new Scanner(System.in);
         //acknowledge the user what to enter
        System.out.println("Enter any natural number:" );
        //storing variable using scanner object
        int num = scanner.nextInt();
        int total = 0;
        System.out.print("Sum of natural number is: ");

        for (int i = 1; i <= num ; i++) {
            total = total + i;


        }System.out.println(total);
    }
}
