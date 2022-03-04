import java.util.Scanner;

public class lab2 {

	public static void main(String[] args) {

		Scanner myScanner= new Scanner(System.in);
		boolean check = true;
	
		while (check) {
			System.out.println("Welcome to shape Factory!");
			System.out.println("Would you like to print a reverse pyriamid pattern or number pattern. Type R for reverse or # for number or X for exit");
			String firstAnswer = myScanner.next();
			
			if (firstAnswer.equalsIgnoreCase("R")) {
				System.out.println("would you like a reverse pyramid of stars or signs? Please input * for stars or @ for signs");
				String secondAnswer= myScanner.next();
			
			if (secondAnswer.equals("*")) {
				for (int i=1; i<=5; i++) {
					for (int j =1; j<=i; j++) {
					System.out.print(" ");}
				
					for (int j =i ; j<=5; j++) {
					System.out.print(" *");}
				
				System.out.println(" ");
				check= !check;
				
				}
			}
			
			else if (secondAnswer.equals("@")) {
				for (int k=1; k<=5; k++) {
					for (int j =1; j<=k; j++) {
							System.out.print(" ");}
						
					for (int j =k ; j<=5; j++) {
							System.out.print(" @");}
						
						System.out.println(" ");
						check = !check;
					}
					
				}
						
			}	
			else if (firstAnswer.equals("#")) {
				int m = 1; int o= 5; int p=1;
					for ( m = 1; m <=o; m++) {
					for (int l = 1; l<=m; l++) {
						System.out.print(p++ + " ");
						}
						
						System.out.println(" ");
						check = !check;
					}	
				}
						
			else if (firstAnswer.equalsIgnoreCase("X")) {
						System.out.println("You have chosen to exit the program");
						System.out.println("Thank you for participating!");
						check= !check;
				 }
					
			else {
					System.out.println("please print an appropriate message");
					}
			 	
		}
		  
		myScanner.close();  
	}
	  
}
  
