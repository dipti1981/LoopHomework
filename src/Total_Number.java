import java.util.Scanner;

//create a class to count total number of 'a' in a string
public class Total_Number {
    void count() {

        //create a Scanner class so user can input
        Scanner scanner = new Scanner(System.in);
        //acknowledge the user what to write
        System.out.println("Please write any sentence: ");
        //storing string using scanner class
        String name = scanner.nextLine();

        int total_count = name.length();
        int total_after_remove_a = name.replace("a", "").length();
        int count = total_count - total_after_remove_a;
        System.out.println("Total number of a is: " + count);

    }
    public static void main(String[] args) {
        //create class object to call not static method to static area
        Total_Number totalNumber = new Total_Number();
        //calling method using class object
        totalNumber.count();
    }


}
