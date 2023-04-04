import java.util.Scanner;

//create a class to find out month name according number
public class Month_Name {
    //create Scanner class so user can put input
    Scanner scanner = new Scanner(System.in);

    //purpose to print
    void print(){

        //acknowledge the user what to enter
        System.out.println("Please enter any number: ");
        //storing variable using scanner class
      int num = scanner.nextInt();

        //using switch to print month name according number
        switch(num){
        case 1:
        System.out.println(num + "= January");
        break;
            case 2:
                System.out.println(num + "= February");
                break;
            case 3:
                System.out.println(num + "= March");
                break;
            case  4:
                System.out.println(num + "= April");
                break;
            case 5:
                System.out.println(num + "= May");
                break;
            case 6:
                System.out.println(num + "= June");
                break;
            case 7:
                System.out.println(num + "+ July");
                break;
            case 8:
                System.out.println(num + "= August");
                break;
            case 9:
                System.out.println(num + "= September");
                break;
            case 10:
                System.out.println(num + "= October");
                break;
            case 11:
                System.out.println(num + "= November");
                break;
            case 12:
                System.out.println(num + "= December");
                break;
            default:
                System.out.println("Invalid entry");



    }
}
        //create main method for calling print method
        public static void main(String[] args) {
            //create class object to call not static method to static area
            Month_Name month_name = new Month_Name();
            //calling print method using class object
            month_name.print();
        }
    }