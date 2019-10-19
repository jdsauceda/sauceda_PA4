package com.company;

import java.security.SecureRandom;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
	public static int newQuestion(int mathType, int difficultyLevel) {
		Scanner scnr = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		int firstNumber = -1, secondNumber = -1, answer = -1, userAnswer = -1;
		double answerDouble = 0.0, userAnswerDouble = 0.0;
		if (mathType == 1) {
			if (difficultyLevel == 4) {
				firstNumber = random.nextInt(9999) + 1;
				secondNumber = random.nextInt(9999) + 1;
				answer = firstNumber + secondNumber;
			} else if (difficultyLevel == 3) {
				firstNumber = random.nextInt(999) + 1;
				secondNumber = random.nextInt(999) + 1;
				answer = firstNumber + secondNumber;
			} else if (difficultyLevel == 2) {
				firstNumber = random.nextInt(99) + 1;
				secondNumber = random.nextInt(99) + 1;
				answer = firstNumber + secondNumber;
			} else {
				firstNumber = random.nextInt(9) + 1;
				secondNumber = random.nextInt(9) + 1;
				answer = firstNumber + secondNumber;
			}
		}
		else if (mathType == 2) {
			if (difficultyLevel == 4) {
				firstNumber = random.nextInt(9999) + 1;
				secondNumber = random.nextInt(9999) + 1;
				answer = firstNumber * secondNumber;
			} else if (difficultyLevel == 3) {
				firstNumber = random.nextInt(999) + 1;
				secondNumber = random.nextInt(999) + 1;
				answer = firstNumber * secondNumber;
			} else if (difficultyLevel == 2) {
				firstNumber = random.nextInt(99) + 1;
				secondNumber = random.nextInt(99) + 1;
				answer = firstNumber * secondNumber;
			} else {
				firstNumber = random.nextInt(9) + 1;
				secondNumber = random.nextInt(9) + 1;
				answer = firstNumber * secondNumber;
			}
		}
		else if (mathType == 3) {
			if (difficultyLevel == 4) {
				firstNumber = random.nextInt(9999) + 1;
				secondNumber = random.nextInt(9999) + 1;
				answer = firstNumber - secondNumber;
			} else if (difficultyLevel == 3) {
				firstNumber = random.nextInt(999) + 1;
				secondNumber = random.nextInt(999) + 1;
				answer = firstNumber - secondNumber;
			} else if (difficultyLevel == 2) {
				firstNumber = random.nextInt(99) + 1;
				secondNumber = random.nextInt(99) + 1;
				answer = firstNumber - secondNumber;
			} else {
				firstNumber = random.nextInt(9) + 1;
				secondNumber = random.nextInt(9) + 1;
				answer = firstNumber - secondNumber;
			}
		}
		else {
			if (difficultyLevel == 4) {
				firstNumber = random.nextInt(9999) + 1;
				secondNumber = random.nextInt(9999) + 1;
				 answerDouble = (double) firstNumber / secondNumber;
			} else if (difficultyLevel == 3) {
				firstNumber = random.nextInt(999) + 1;
				secondNumber = random.nextInt(999) + 1;
				answerDouble = (double) firstNumber / secondNumber;
			} else if (difficultyLevel == 2) {
				firstNumber = random.nextInt(99) + 1;
				secondNumber = random.nextInt(99) + 1;
				answerDouble = (double) firstNumber / secondNumber;
			} else {
				firstNumber = random.nextInt(9) + 1;
				secondNumber = random.nextInt(9) + 1;
				answerDouble = (double) firstNumber / secondNumber;
			}
		}

		int incrementer = 0;
		if (mathType == 1) {
			System.out.println("How much is " + firstNumber + " + " + secondNumber + "?");
		}
		else if (mathType == 2) {
			System.out.println(("How much is " + firstNumber + " * " + secondNumber + "?"));
		}
		else if (mathType == 3) {
			System.out.println(("How much is " + firstNumber + " - " + secondNumber + "?"));
		}
		else {
			System.out.println(("How much is " + firstNumber + " / " + secondNumber + "?"));
		}
		if (mathType != 4) {
			userAnswer = scnr.nextInt();
			if (userAnswer == answer) {
				correctResponses(random);
				++incrementer;
			} else {
				incorrectResponses(random);
			}
		}
		else {
			userAnswerDouble = scnr.nextDouble();
			if (abs(answerDouble / userAnswerDouble) >= .95 && abs(answerDouble/userAnswerDouble) <= 1.01) {
				correctResponses(random);
				++incrementer;
			} else {
				incorrectResponses(random);
			}
		}

		return incrementer;
	}


	public static void correctResponses(SecureRandom random) {
		int correctResponse = random.nextInt(4);
		switch (correctResponse) {
			case 0:
				System.out.println("Very Good!");
				break;
			case 1:
				System.out.println("Excellent!");
				break;
			case 2:
				System.out.println("Nice work!");
				break;
			case 3:
				System.out.println("Keep up the good work!");
				break;
		}
	}

	public static void incorrectResponses(SecureRandom random) {
		int incorrectResponse = random.nextInt(4);
		switch (incorrectResponse) {
			case 0:
				System.out.println("No. Please try again.");
				break;
			case 1:
				System.out.println("Wrong. Try once more.");
				break;
			case 2:
				System.out.println("Don't give up!");
				break;
			case 3:
				System.out.println("No. Keep trying.");
				break;
		}
	}

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int quit = 1;
		System.out.print("This program will assist a student in practicing math problems. Please choose a difficulty level from 1 to 4> ");
		int difficultyLevel = scan.nextInt();
		System.out.println("Please choose the type of problems to practice:");
		System.out.println("1 is addition only");
		System.out.println("2 is multiplication only");
		System.out.println("3 is subtraction only");
		System.out.println("4 is division only");
		System.out.print(">");
		int mathType = scan.nextInt();
		while (quit != 2) {
			int counter = 0, percentageCorrect;
			for (int i = 0; i < 10; ++i) {
				percentageCorrect = newQuestion(mathType, difficultyLevel);
				counter += percentageCorrect;
			}
			if ((double) counter / 10 >= .7500) {
				System.out.println("Congratulations, you are ready to go to the next level!");
			} else {
				System.out.println("Please ask your teacher for extra help.");
			}
			System.out.println("You got " + ((double)counter/10)*100 + "% correct.");
			System.out.print("Would you like to continue the session press 1 or 2 to quit. > ");
			quit = scan.nextInt();
			if (quit != 2) {
				System.out.print("Please choose a difficulty level from 1 to 4 > ");
				difficultyLevel = scan.nextInt();
				System.out.println("Please choose the type of problems to practice:");
				System.out.println("1 is addition only");
				System.out.println("2 is multiplication only");
				System.out.println("3 is subtraction only");
				System.out.println("4 is division only");
				System.out.print(">");
				mathType = scan.nextInt();

			}
		}
	}
}
