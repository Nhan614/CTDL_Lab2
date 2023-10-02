package task1;

public class Task1_2 {
	// get the nth value of the Fibonacci series
		public static int getFibonacci(int n) {
			if (n == 0)
				return 0;
			else if (n == 1 || n == 2)
				return 1;
			return getFibonacci(n - 1) + getFibonacci(n - 2);
		}

		// This method is used to display a Fibonaccci series based on the parameter n.
		public static int printFibonacci(int n) {
			if (n < 0) {
				return -1;
			} else if (n == 0 || n == 1) {
				return n;
			} else {
				return printFibonacci(n - 1) + printFibonacci(n - 2);
			}
		}

		public static void main(String[] args) {
			int n = 10;
			System.out.println(getFibonacci(5));

			for (int i = 0; i < n; i++) {
				System.out.print(printFibonacci(i) + " ");
			}
		}
}
