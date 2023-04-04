import java.util.Scanner;

//create a class to print multiplication table
public class Multiplication {
    //create a Scanner class so user can input
    Scanner scanner = new Scanner(System.in);

    void print_table(){
        //user should know what to enter
        System.out.println("Please input any number: ");
        //storing variable using scanner class
        int num = scanner.nextInt();

        for(int i=1; i<=12; i++)
            System.out.println(num +" x " +i +" = "+(num*i));
    }

    public static void main(String[] args) {
        //creating class object to call not static method to static area
        Multiplication multiplication = new Multiplication();
        //calling method using multiplication object
        multiplication.print_table();
    }

}
