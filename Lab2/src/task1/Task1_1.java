package task1;

public class Task1_1 {

	// S(n)=1-2+3-4+…+ ((-1)^(n+1) ).n , n>0
	public static int getSn1(int n) {
		if (n == 1) {
			return 1;
		} else {
			return getSn1(n - 1) + (int) Math.pow(-1, n + 1) * n;
		}
	}

	// S(n)=1+1.2+1.2.3+…+1.2.3…n, n>0
		public static int getSn2(int n) {
			if (n == 1) {
				return 1;
			} else {
				return getSn2(n - 1) + factorial(n);
			}
		}
		public static int factorial(int n) {
			int result = 1;
			for (int i = 1; i <= n; i++) {
				result = result * i;
			}
			return result;
		}

	// S(n)=1^2+2^2+3^2+....+n^2 , n>0
	public static int getSn3(int n) {
		if (n == 1) {
			return 1;
		} else {
			return getSn3(n - 1) + (int) Math.pow(n, 2);
		}
	}

	// S(n)=1+1/2+1/(2.4)+1/(2.4.6)+…+1/(2.4.6.2n), n>=0
		public static double sum(int n) {
			if (n == 0) {
				return 1;
			} else {
				return sum(n - 1) * 2 * n;
			}
		}
		public static double getSn4(int n) {
			if (n == 0) {
				return 1;
			} else {
				return getSn4(n -1 ) + 1/sum(n);
			}
		}

	public static void main(String[] args) {
		System.out.println(getSn1(4));
		System.out.println(getSn2(5));
		System.out.println(getSn3(3));
		System.out.println(getSn4(2));
	}
}
