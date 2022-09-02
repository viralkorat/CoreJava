import java.util.Scanner;
public class Practise {

	public static void main(String[] args) {

//*********************************************************************************************************		
	/*	Scanner s = new Scanner (System.in);
		System.out.println("Enter your name"); //Enter your name press Enter button
			String name = s.nextLine();
			
	System.out.println("Enter your age"); //Enter your age press Enter button
		int age = s.nextInt();
		if (age >= 0) {
			System.out.println("Your name is " + name + " and you are " + age);
			
		}
		else {
			System.out.println("Error: Please enter valid age");
		}
	
		
	}*/
//*********************************************************************************************************

	        Scanner s = new Scanner(System.in);
	        int choice = 1;
	        while (choice == 1) {
	            int a;

	            System.out.println("Enter a number to check odd or even");
	            a = s.nextInt();

	            if (a % 2 == 0) {
	                System.out.println("Your number is even");
	            } else {
	                System.out.println("Your number is odd");
	            }

	            System.out.println("Want to check more 1 for yes 0 for no");

	            choice = s.nextInt();
	        }

	        System.out.println("I hope you checked all your numbers.");
	    }
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		