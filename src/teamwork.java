import java.util.Scanner;

public class teamwork {

	public static void main(String[] args) {
		/*Assignment:
			1.	Given N --- Print this pattern up to N: 1, 4, 8, 12, 16…
			2.	Given N --- Print backward to 0. 
			a.	(Ask user for a number and lets assume N is 5 so if the user input 5 
			– then the program should print: 5 4 3 2 1 0)
			3.	Build a basic calculator (Plus, Minus, Multiplication, Division)
			a.	(Ask user for a number and then ask for the second number 
			– then ask for the operation: ADD, SUB, MULTI, DIV)
			b.	Use “IF and ELSE” or “SWITCH”
			c.	Use method for each operation
			4.	Ask the USER for a string and print if the string is palindrome
			5.	Ask user for a number and print out ODD if the number is odd; otherwise print EVEN.*/
//===============================================================================================================================
//	1.	Given N --- Print this pattern up to N: 1, 4, 8, 12, 16…
	
		/*for (int n=0;n<20;n= n+4)
			if (n=0)
			{
			System.out.println(n+1);	
			}
			else
				System.out.println(n);
		{
			
			}
	}
}*/
		//121
		
	System.out.println("Enter your no.");
	Scanner input= new Scanner(System.in);
	String ui= input.next();
	int Length= ui.length();
	String reverse= new String();
	for (int i=Length-1;i>=0;i--) {
	System.out.print(reverse= reverse+ui.charAt(i));
	//System.out.println(reverse);
            if(ui.contentEquals(reverse)) {
            	System.out.println("palindrome");}
	         else
		         System.out.println(" not a palindrome");
	}}}
	


	


