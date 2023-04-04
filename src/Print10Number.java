import java.util.Scanner;

//create a class to print any 10 numbers between user input range
public class Print10Number {


    //purpose to print 10 numbers
    void range(){
        //create a Scanner class so user can input
        Scanner scanner = new Scanner(System.in);

        //acknowledge the user what to enter
        System.out.println("Enter start and end number in the range of 10: ");
    //storing int variable using scanner object
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print("Ten numbers between the range are: ");

        //using for loop to print ten numbers between the range given
        for (int i = a; i < b ; i++) {
            System.out.print(i + " ");

        }
    }

    public static void main(String[] args) {
        //create class object to call not static method to static are
        Print10Number print10Number = new Print10Number();
        //calling method using class object
        print10Number.range();

    }
}
