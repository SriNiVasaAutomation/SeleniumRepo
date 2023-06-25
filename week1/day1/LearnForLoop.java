package week1.day1;

public class LearnForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <=10; i++) { //i=1; 1<=5; 1++
			System.out.println(i); //0 1 2 3 ...
		}
		System.out.println("Out of For Loop");
		
		int i = 15;
		int j = 2;
		
		System.out.println(i); // 15
		System.out.println(i++); // Post Increment (15)
		System.out.println(i); // Addition (16)
		
		System.out.println(i); // 16
		System.out.println(++i); // Post Increment (17)
		System.out.println(i); // Addition (17)
		
		System.out.println(i+j); // Addition
		System.out.println(i-j); // Subtraction
		System.out.println(i*j); // Multiplication
		System.out.println(i==j); // Comparison
		System.out.println(i!=j); // Not Equal
		System.out.println(i/j); // Quotient
		System.out.println(i%j); // Remainder

	}

}
