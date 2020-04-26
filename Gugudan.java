package april26th;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int number, result;
		int i, n;
		
		do {
			System.out.print("2이상 9이하 자연수를 입력해주세요.");
			number = sc.nextInt();
		} while (number >9 || number == 1);
		
		if (number == 0) {
			for (i = 2; i<=9; i++) {
				for (n = 1; n<=9; n++) {
					result = i*n;
					System.out.println(i + "×" + n + "=" + result);
				}
			}
		}
		else if (number < 0) {
			System.out.println("구구단을 출력할 수 없습니다.ㅜㅜ");
		}
		else {
			for (i = 1; i<=9; i++) {
				result = number * i;
				System.out.println(number + "×" + i + "=" + result);
			}
		}
	}

}
