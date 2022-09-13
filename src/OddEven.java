<<<<<<< HEAD
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
	
		Scanner s = new Scanner (System.in);
		System.out.println("Please enter your number");
		
		int num = s.nextInt();
		if (num%2 == 0) {
		
		System.out.println("Your number is even");
		}
		else {
			System.out.println("Your number is odd");
		}
		}
	}

=======

public class OddEven {

	public static void main(String[] args) {
	
	int num=100;
	
	if (num % 2 == 0)
		System.out.println("even number selected");
	else
		System.out.println("odd number selected");

	}

}
>>>>>>> branch 'master' of https://github.com/viralkorat/CoreJava.git
