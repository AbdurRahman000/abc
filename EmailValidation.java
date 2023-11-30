package practicePRojectPhase;
import java.util.*;
public class EmailValidation {
	public class EmailSearch {

	    public static boolean searchEmail(String[] emailArray, String targetEmail) {
	        for (int i=0;i< emailArray.length;i++) {
	            if (emailArray[i].equals(targetEmail)) {
	                return true;
	       
	            }
	        }
	        return false;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] employeeEmails = {"employee1@example.com", "employee2@example.com", "employee3@example.com"};

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for the email to search
        System.out.print("Enter the email ID to search: ");
        String reqemail = scanner.nextLine();

        // Perform the search
        boolean result = searchEmail(employeeEmails, reqemail);

        // Display the result
        if (result) {
            System.out.println("Email ID " + reqemail + " found in the array.");
        } else {
            System.out.println("Email ID " + reqemail + " not found in the array.");
        }
	}
	}
}


