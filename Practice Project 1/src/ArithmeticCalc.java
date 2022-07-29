import java.util.Scanner;

public class ArithmeticCalc {
	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the first and the Second number - ");
			double a = sc.nextDouble();
			double b = sc.nextDouble();

			System.out.print("Choose and Enter the type of operation you want to perform (+, -, *, /, %) - ");
			char op = sc.next().charAt(0);
			solve(a, b, op);
		}
	}
	public static double solve(double a, double b, char op)
	{
		double ans = 0;
		if (op == '+') {
			ans =  (a + b);
		}
		else if (op == '-') {
			ans =  (a - b);
		}
		else if (op == '*') {
			ans =  (a * b);
		}
		else if (op == '%') {
			ans =  (a % b);
		}
		else if (op == '/') {
			ans =  (a / b);
		}

		System.out.println("Your answer is - " + ans);
		return ans;
	}
}
