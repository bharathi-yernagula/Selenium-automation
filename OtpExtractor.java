package javaTutorial;

import java.util.Random;

/**
 * 
 * @author bharathi
 *
 */

public class OtpExtractor {

	public static void main(String[] args) {

		// Using String split function if we know the exact position of the OTP

		String str = "Your One Time Password (OTP) for LOGIN on IRCTC is 130265.";

		String otp = str.split(" ")[10];
		String otp1 = otp.replace(".", " ");

		System.out.println("OTP to be entered is " + otp1);

		// Using CharAt function if we do not know the exact position

		System.out.println("OTP to be entered is ");

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c >= 48 && c <= 57)
				System.out.print(c);

		}
		// Generate OTP Randomly and extract the OTP
		String otp_str = "Your One Time Password (OTP) for LOGIN on IRCTC is" + " " + otpgenerator();
		// System.out.println(otp_str);

		String otp1_str1 = otp_str.split(" ")[10];

		System.out.println("OTP to be entered is " + otp1_str1);

	}

	public static int otpgenerator() {
		Random rand = new Random();

		int otpgen = rand.nextInt(1000000);

		System.out.println("\nOTP Generated is  " + otpgen);

		return (otpgen);
	}

}
