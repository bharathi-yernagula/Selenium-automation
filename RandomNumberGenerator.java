package javaTutorial;

/**
 * @author bharathi
 */

import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {

		// Indian Random mobile number generator code

		Random rand = new Random();

		// Random Indian Mobile Number

		double d = Math.random();
		int mob_Ind = (int) (d * 999999999);
		int mob_last = rand.nextInt(10);

		// System.out.println("Indian Random Mobile Number is " + " " + "+" + 91 + "-" +
		// mob_Ind + mob_last);

		System.out.println("Indian Random Mobile Number is " + "+" + 91 + "-" + "9" + mob_Ind);

		// Random US Mobile Number

		double d1 = Math.random();
		int mob_US = (int) (d1 * 999999999);

		System.out.println("US Random Mobile Number is " + "+" + 1 + "-" + mob_US + mob_last);

		// Random Indian Zip code

		int zip_Code = rand.nextInt(1000000);

		System.out.println("Indian Random ZIP Code " + zip_Code);

	}

}
