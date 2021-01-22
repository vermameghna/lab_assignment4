package labAssignment4;

import java.util.InputMismatchException;
import java.util.Scanner;


class InputException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InputException() {}

	InputException(String message){
		super(message);
	}
}

public class ValidateInput {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num;
		while (true) {
			System.out.println(
					"Please Enter a number or Enter \"-1\" if you want to quit");
			try {
				num = s.nextInt();
				if(num > 100){
					throw new InputException("Number can't be greater than 100");
				}else if (num == -1) {
					System.out.println("Loop Break!");
					break;
				} else if (num % 2 == 0) {
					System.out.println("You have entered an even number");
				} else if (num % 2 != 0) {
					System.out.println("You have entered an odd number");
				} else {
					throw new InputMismatchException();
				}
			} catch (InputMismatchException e) {
				System.out.println("You must enter an Integer");
				s.nextLine();
			} catch(InputException e) {
				System.out.println(e.getMessage());
			}
		}
		
		s.close();
	}
}
