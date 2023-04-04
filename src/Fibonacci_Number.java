import java.util.Scanner;

//create a class to print the sequence of fibonacci number
public class Fibonacci_Number {

    //purpose to print the sequence of fibonacci number
    void print(){

        //using Scanner class to inform user what to enter
        Scanner scanner = new Scanner(System.in);
        //acknowledge the user what to enter
        System.out.println("Enter any number: ");
        //storing int variable using scanner class
        int num = scanner.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.print("Fibonacci sequence is: ");
        //using for loop to print fibonacci number
        for (int i = 1; i <=num ; i++) {

                System.out.print(n1 +" ");
                int sum = n2+n1;
                n1 = n2;
                n2 = sum;
        }
    }

    public static void main(String[] args) {
        //create class object to call not static method to static area
        Fibonacci_Number fibonacci_number = new Fibonacci_Number();
        //calling method using scanner object
        fibonacci_number.print();
    }


}
