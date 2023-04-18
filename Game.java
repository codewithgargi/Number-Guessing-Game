import java.util.Scanner;

public class Game {
	static int res = 0;

	public static int generateNumber() {
		int min = 1, max = 100;
		int range = max - min + 1;
		int rand_num = (int) (Math.random() * range) + min;
		return rand_num;
	}

	public static int score(int total, int tries) {
		int scr = total - (tries * 10);
		return scr;
	}

	public static boolean round1() {
		Scanner sc = new Scanner(System.in);
		int tries = 0;
		int rand = generateNumber();
		System.out.println("Round One\n");
		System.out.println(
				"Please read the Instructions carefully before play the Game!!\n\n 1- Guess the number within the range 1 to 100.\n\n 2- You have only 6 attempts to guess the number.\n\n 3- Each try deduct your points so, make sure guess the number in minimum try.\n\n 4- you will need more than 30 points to clear this round then you eligible for next round.\n");
		System.out.println("All the best\n");
		System.out.println("Your number is #\n");

		while (tries < 6) {
			System.out.println("\nGuess the number...");
			int guess = sc.nextInt();
			if (guess > 0 && guess < 101) {
				if (guess < rand) {
					tries++;
					System.out.println("\nYou guess the lower number from actual.");

				} else if (guess > rand) {
					tries++;
					System.out.println("\nYou guess the higher number from actual.");

				} else if (guess == rand) {
					res = score(100, tries);
					tries++;
					System.out.println("\nBravo!! you caught the right number in your " + tries
							+ "th attempt with the Score (" + res + ")");

					break;
				}
			} else {
				tries++;
				System.out.println("\nEnter the number again within the given range.");
			}
		}
		if (res > 30)
			return true;
		return false;
	}

	public static boolean round2() {
		Scanner sc = new Scanner(System.in);
		res = 0;
		int tries = 0;
		int rand = generateNumber();
		System.out.println("Round Two\n");
		System.out.println(
				"Please read the Instructions carefully before play the Game!!\n\n 1- Guess the number within the range 1 to 100.\n\n 2- You have only 4 attempts to guess the number.\n\n 3- Each try deduct your points so, make sure guess the number in minimum try.\n\n 4- you will need more than 50 points to clear second round then you eligible for next round.\n");
		System.out.println("All the best\n");
		System.out.println("Your number is #\n");

		while (tries < 4) {
			System.out.println("\nGuess the number...");
			int guess = sc.nextInt();
			if (guess > 0 && guess < 101) {
				if (guess < rand) {
					tries++;
					System.out.println("\nYou guess the lower number from actual.");

				} else if (guess > rand) {
					tries++;
					System.out.println("\nYou guess the higher number from actual.");

				} else if (guess == rand) {
					res = score(100, tries);
					tries++;
					System.out.println("\nBravo!! you caught the right number in your " + tries
							+ "th attempt with the score (" + res + ")");

					break;
				}
			} else {
				tries++;
				System.out.println("\nEnter the number again within the given range.");

			}
		}
		if (res > 50)
			return true;
		return false;
	}

	public static boolean round3() {
		Scanner sc = new Scanner(System.in);
		res = 0;
		int tries = 0;
		int rand = generateNumber();
		System.out.println("final\n");
		System.out.println(
				"Please read the Instructions carefully before play the Game!!\n\n 1- Guess the number within the range 1 to 100.\n\n 2- You have only 3 attempts to guess the number.\n\n 3- Each try deduct your points so, make sure guess the number in minimum try.\n\n 4- This is the final round and you will need more than 70 points to win the Game.\n");
		System.out.println("All the best\n");
		System.out.println("Your number is #\n");

		while (tries < 3) {
			System.out.println("\nGuess the number...");
			int guess = sc.nextInt();
			if (guess > 0 && guess < 101) {
				if (guess < rand) {
					tries++;
					System.out.println("\nYou guess the lower number from actual.");

				} else if (guess > rand) {
					tries++;
					System.out.println("\nYou guess the higher number from actual.");

				} else if (guess == rand) {
					res = score(100, tries);
					tries++;
					System.out.println("\nBravo!! you caught the right number in your " + tries
							+ "th attempt with the score (" + res + ")");

					break;
				}
			} else {
				tries++;
				System.out.println("\nEnter the number again within the given range.");

			}
		}
		if (res > 70)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean r1 = round1();
		if (r1) {
			System.out.println("\nCongrats! You have cleared the first round :)\n\nNow move towards the second round.");
			boolean r2 = round2();
			if (r2) {
				System.out.println(
						"\nCongrats! You have cleared the second round :)\n\nNow move towards the final round.");
				boolean r3 = round3();
				if (r3) {
					System.out.println("\nBravo :) You won the Game.");
				} else
					System.out.println("\nYou Lost in final round :( \n\n Better luck in next time.");
			} else
				System.out.println("\nYou Lost in second round :( \n\n Better luck in next time.");
		} else
			System.out.println("\nYou Lost in first round :( \n\n Better luck in next time.");

	}

}
