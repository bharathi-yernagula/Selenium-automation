package javaTutorial;

import java.util.Scanner;

/**
 * @author bharathi
 *
 */
public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("\n Enter the operation to be performed \n");
		System.out.println("1. Addition\n");
		System.out.println("2. Subtraction \n");
		System.out.println("3. Multiplication \n");
		System.out.println("4. Division \n");
		System.out.println("5. Modulus \n");

		int op = sc.nextInt();

		System.out.println("\n Enter 2 numbers to perform the operation requested \n");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		switch (op) {
		case 1:
			int a = addition(num1, num2);
			System.out.println("\n Result after adding " + num1 + " & " + num2 + " is " + a);
			break;
		case 2:
			int s = subtraction(num1, num2);
			System.out.println("\n Result after subtracting " + num1 + " & " + num2 + " is " + s);
			break;
		case 3:
			int m = multiplication(num1, num2);
			System.out.println("\n Result after multiplication" + num1 + " & " + num2 + " is " + m);
			break;
		case 4:
			int d = division(num1, num2);
			System.out.println("\n Result after division" + num1 + " & " + num2 + " is " + d);
			break;
		case 5:
			int mod = modulus(num1, num2);
			System.out.println("\n Result after adding" + num1 + " & " + num2 + " is " + mod);
			break;

		}

		sc.close();
	}

	public static int addition(int num1, int num2) {
		return (num1 + num2);

	}

	public static int subtraction(int num1, int num2) {
		return (num1 - num2);

	}

	public static int multiplication(int num1, int num2) {
		return (num1 * num2);

	}

	public static int division(int num1, int num2) {
		return (num1 / num2);

	}

	public static int modulus(int num1, int num2) {
		return (num1 % num2);

	}

}
