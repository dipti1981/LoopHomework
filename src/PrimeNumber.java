import java.util.Scanner;

//create a class to check whether input number is prime or not
public class PrimeNumber {

    //create a Scanner class so use can input
    Scanner scanner = new Scanner(System.in);

    //purpose to check prime number
    void check() {
        //acknowledge the user what to enter
        System.out.println("Enter any number: ");
        //storing int variable using scanner object
        int num = scanner.nextInt();
        //assume it is prime number
        boolean IsPrime = true;

        //using for loop to find out prime number
        for (int i = 2; i <=num/2 ; i++) {
            if(num % i == 0){
                IsPrime = false;
                break;
            }
        }

        if(IsPrime == true)
            System.out.println(num + ": is a prime number");
        else
            System.out.println(num + ": is not a prime number");
    }
    public static void main(String[] args) {
        //create class object to call not static method to static area
        PrimeNumber primeNumber = new PrimeNumber();
        //calling method using class object
        primeNumber.check();
    }

    }
