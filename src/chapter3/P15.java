package chapter3;
import java.util.Scanner;
public class P15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Generate a lottery
		int lottery = (int)(Math.random()*900)+100;

		// Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (three digits): ");
		int guess = input.nextInt();

		// Get digits from lottery
		int lotteryDigit3 = lottery %10;
		int lotteryDigit2 = lottery %100-lotteryDigit3;
		int lotteryDigit1 = lottery / 100;
		// Get digits from guess
		int guessDigit3 = lottery %10;
		int guessDigit2 = lottery %100-guessDigit3;
		int guessDigit1 = lottery / 100;

		System.out.println("The lottery number is " + lottery);

		// Check the guess
		if (guess == lottery)
			System.out.println("Exact match: you win $10,000");
		else if (guessDigit2 == lotteryDigit1
				&& guessDigit1 == lotteryDigit2&&guessDigit3 == lotteryDigit3)
			System.out.println("Match all digits: you win $3,000");
		else if (guessDigit1 == lotteryDigit1 
				|| guessDigit1 == lotteryDigit2
				|| guessDigit1 == lotteryDigit3 
				|| guessDigit2 == lotteryDigit1 
				|| guessDigit2 == lotteryDigit2
				|| guessDigit2 == lotteryDigit3
				|| guessDigit3 == lotteryDigit3
				|| guessDigit3 == lotteryDigit2
				|| guessDigit3 == lotteryDigit1)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry, no match"); 
		input.close();
	}

}
