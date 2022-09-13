import java.util.Scanner;
public class Practise {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a;

		System.out.println("Enter your number:");
		a = s.nextInt();

		while (true) 
		{
			if (a % 2 == 0 && a>0) {
				System.out.println("Your number is even");
				a = s.nextInt();
			} else if (a<0){
				System.out.println("Invalid number");
				a = s.nextInt();
			}
			else {
				System.out.println("Your number is odd");
				a = s.nextInt();
		}

	}
}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		