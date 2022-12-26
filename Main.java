import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter code");
		Scanner inputCode = new Scanner(System.in);
		String code = inputCode.nextLine();
		
		if(code.equals("*141#")) {
			System.out.println("1.    My Offer");
			System.out.println("2.    Data Bundles");
			System.out.println("3.    N5000/22GB/30 days");
		}else
			System.out.println("Invalid request.");
		
		Scanner inputCode2 = new Scanner(System.in);
		int code2 = inputCode2.nextInt();
		
		if(code2 == 1) {
			System.out.println("1.    Daily/Weekly Bundles");
			System.out.println("2.    Weekly Bundles");
			System.out.println("3.    Monthly Bundles");
		}else {
			System.out.println("Invalid request.");
			System.out.println("1.    Daily/Weekly Bundles");
			System.out.println("2.    Weekly Bundles");
			System.out.println("3.    Monthly Bundles");
		}
		
		Scanner inputCode3 = new Scanner(System.in);
		int code3 = inputCode3.nextInt();
		
		if(code3 == 1) {
			System.out.println("1.    N50/40MB/Daily");
			System.out.println("2.    N100/100MB/Daily");
			System.out.println("3.    N200/200MB/3dys");
		}else {
			System.out.println("Invalid request.");
			System.out.println("1.    N50/40MB/Daily");
			System.out.println("2.    N100/100MB/Daily");
			System.out.println("3.    N200/200MB/3dys");
		}
}
}