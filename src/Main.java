import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObjScanner = new Scanner(System.in);  // Create a Scanner object

        System.out.println("What is your name");
        String sName = myObjScanner.nextLine();  // Read user input

        System.out.println("What is your age");
        String sAge = myObjScanner.nextLine();  // Read user input

        String sUserName = String.valueOf(sName.toLowerCase().charAt(0)) + String.valueOf(sName.charAt(1)) + sAge;
        System.out.println("Your username is: "+sUserName);

    }
}