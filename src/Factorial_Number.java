import java.util.Scanner;

//create a class to find out factorial of a number
public class Factorial_Number {
    //create a Scanner class so user can input
    Scanner scanner = new Scanner(System.in);
    //purpose to find out factorial of a number
    void find_factorial(){
        //acknowledge the user what to enter
        System.out.println("Enter any number: ");
        //storing variable using scanner object
        int num = scanner.nextInt();

        for (int i = num-1; i >1; i--) {
            num = num * i;
            
        }
        System.out.println(("Factorial of number is: "+ num));
    }

    public static void main(String[] args) {
        //create a class object to call not static method to static area
        Factorial_Number factorial_number = new Factorial_Number();
        //call the not static method using class object
        factorial_number.find_factorial();
    }

}
