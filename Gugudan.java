package april26th;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int number, result;
		int i;
		
		do {
			System.out.print("2�̻� 9���� �ڿ����� �Է����ּ���.");
			number = sc.nextInt();
		} while (number<2 || number >9);
		
		for (i = 1; i<=9; i++) {
			result = number * i;
			System.out.println(number + "��" + i + "=" + result);
		}
	}

}
