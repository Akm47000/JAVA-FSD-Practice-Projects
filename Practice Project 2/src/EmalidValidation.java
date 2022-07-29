
import java.util.Scanner;

public class EmalidValidation {
	public static void main(String[] args) {
		System.out.println("Enter total no of email ids");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str[] = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter an email id");
			str[i] = sc.next();
		}
		System.out.println("Enter an email id to be searched: ");
		String s = sc.next();
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			if (s.equals(str[i])) {
				System.out.println("Given email id is Valid and found at: " + (i + 1));
				flag = true;
			}
		}
		if (!flag)
			System.out.println("Given email id is Invalid");
	}

}