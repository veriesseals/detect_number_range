import java.util.Scanner;

public class AgeChecker {

    public static void main (String [] args) {

        // Create a Scanner object to read input from the user
        try(Scanner scnr = new Scanner(System.in)) {

            // 
            int userAge;

            // Prompt user for age
            System.out.print("Enter your age: ");
            userAge = scnr.nextInt();

            // Check if age is within the range of 18 to 25
            if((userAge >= 18) && (userAge <= 25)){
                // User is eligible
                System.out.println("Eligible");
            }
            else{
                // User is ineligible
                System.out.println("Ineligible");
            }
        }
    }
}
