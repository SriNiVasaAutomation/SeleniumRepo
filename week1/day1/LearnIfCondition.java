package week1.day1;

public class LearnIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		// Find whether the given number is + or -
		if (number > 0) {// 0>0 -> false
			System.out.println("The given Number" + number + "is Postive");
		} else if (number < 0) {// 0<0 -> false
			System.out.println("The given Number is Negative");

		} else if (number == 0) {// 0==0 -> false
			System.out.println("The given Number is Negative");

		} else {
			System.out.println("The given Number is neutral");
		}

	}
}
