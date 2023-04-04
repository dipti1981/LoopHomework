import java.util.Scanner;

//create a class to check number is divisible by 3 and 5
public class Division {

    //purpose to check number divisible by 3 and 5
    void divide() {
        //create Scanner class so user can give input
         Scanner scanner = new Scanner(System.in);
         //acknowledge the user what to enter
        System.out.println("Enter start  number between 1 to 100: ");
        //storing int variable using scanner object
        int num1 = scanner.nextInt();
        //acknowledge the user what to enter
        System.out.println("Enter end number between 1 to 100: ");
        //storing int variable using scanner object
        int num2 = scanner.nextInt();

        System.out.println("number divide by 3 is: " );
        for (int i = num1; i <=num2 ; i++) {
            if(i % 3 == 0){
                if(true);
                System.out.print(i + ", ");
            }
        }

        System.out.println("\nnumber divide by 5 is: ");
        for (int i = num1; i <=num2 ; i++) {
            if(i % 5 == 0){
                if(true);
                System.out.print(i +", ");
            }
        }
    }

    public static void main(String[] args) {
        //create class object to call not static method in static area
        Division division = new Division();
        division.divide();
    }
}


