import java.util.Scanner;

//create a class to reverse number using loop
public class ReverseNumber {

    //create a Scanner class so user can input
    Scanner scanner = new Scanner(System.in);
    //purpose to reverse number
    void reverse(){
        //acknowledge the user what to enter
        System.out.println("Enter any number: ");
        //storing int variable using scanner class
        int num = scanner.nextInt();
        System.out.print("Reverse number is: ");

        for (int i = num; i > 0 ;i = i/10) {
            System.out.print( i % 10);
        }
    }

    public static void main(String[] args) {
        //create a class object to call not static method to static area
        ReverseNumber reverseNumber = new ReverseNumber();
        //calling method using class object
        reverseNumber.reverse();
    }
    }
    

