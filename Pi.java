package april26th;

public class Pi {

	public static void main(String[] args) {
		double pi = 0;
		int i, j, sign = 4;
		int n = 1000;
		
		for (i = 0, j = 1; i < n; i++, j += 2, sign *= -1)
			pi += (double) sign / j;
		
		System.out.println("1000회 연산한 원주율값: " + pi);
	}

}
