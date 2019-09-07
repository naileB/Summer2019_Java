import java.util.Scanner;

public class xc {
	 public static void main(String[] args) {
		    //WRITE YOUR CODE HERE 
		/* Scanner s = new Scanner(System.in);
		    System.out.println("Enter Item1 and its price:");
		    String item1 = s.next();
		    Double price1 = s.nextDouble();
		    System.out.println("Enter Item2 and its price:");
		    String item2 = s.next();
		    Double price2 = s.nextDouble();
		    System.out.println("Enter Item3 and its price:");
		    String item3 = s.next();
		    Double price3 = s.nextDouble();
		   System.out.println("Item1: "+item1+" Price: "+price1+", Item2: "+item2+" Price: "+price2+", Item3: "+item3+" Price: "+price3); 

		   System.out.println("Total Price: "+ (price1+price2+price3)/3);
  
		 */    
		  
		 /*
		  Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.
Declare 2 int variables: age, zipcode
Declare 2 double variables: height, weight.
Declare boolean variable: isMarried (for marriage status).
Declare 2 long variables: workPhoneNumber and personalPhoneNumber.

-Create a Scanner object named scan.


		 







-build contacts variable by concatenating work phone, personal phone and email
-build fullName variable by concatenating first name and last name
-build address variable by concatenating street, city, state, zip code

//this is should be an output in the console (terminal)

Patient personal information
Full name: May, James
Address: 7925 Jones Branch Dr, McLean, VA 22102
Contacts: work phone number - 7896542314, personal phone number - 2406542314,  email: jamesmay@gmail.com
Age: 35
Height: 5.1
Weight: 173.2 pounds
Married?: true


		  */
		 
		 Scanner s = new Scanner(System.in);
		 System.out.println("Welcome to the patient portal!");
		 System.out.println("Please enter your personal information");
		 
		    System.out.println("Enter your name");
		    String firstName = s.nextLine();	
		    
		    System.out.println("Enter your last name");
		    String lastName = s.nextLine();
		    
		    System.out.println("Enter your email");
		    String email = s.nextLine();
		    
		    System.out.println("Enter your street");
		    String street = s.nextLine();
		    
		    System.out.println("Enter your city");
		    String city = s.nextLine();
		    
		    System.out.println("Enter your state");
		    String state = s.nextLine();
		    
		    System.out.println("Enter your zip code");
		    int zipcode = s.nextInt();

		    System.out.println("Enter your work phone number");
		    long workPhoneNumber = s.nextLong();

		    System.out.println("Enter your personal phone number");
		    long personalPhoneNumber = s.nextLong();

		    System.out.println("Enter your age");
		    int age = s.nextInt();
		    
		    System.out.println("Enter your height");
		    double height = s.nextDouble();
		 
		    System.out.println("Enter your weight");
		    double weight = s.nextDouble();
		    
		    System.out.println("Are you married?");
		    boolean isMarried = s.nextBoolean();
		    
		    
		    
		  }
}
