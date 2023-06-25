package week1.day1;

public class LearnSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browserType = "edge";
		
		switch (browserType) {
		case "Chrome":
			System.out.println("Open the Chrome Browser");
			//break;
			
		case "Edge":
			System.out.println("Open the Edge Browser");
			break;
		case "Firefox":
			System.out.println("Open the Firefox Browser");
			break;

		default:
			System.out.println("Open Defalut Browser");
			break;
		}

	}

}
