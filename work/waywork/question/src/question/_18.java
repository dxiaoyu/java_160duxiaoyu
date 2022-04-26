package question;

/*
 *@author 杜小雨
 *
 *2022年4月20日-上午11:04:11
 */
import java.util.Scanner;
public class _18 {
	public void picture(int n) {
		if (n % 2 == 0) {
			for (int i = 0; i < n / 2; i++) {
				for (int j = 0; j < n / 2 - 1 - i; j++)
					System.out.print(" ");
				for (int j = 0; j < 2 * i + 1; j++)
					System.out.print("*");
				System.out.println("");
			}
			for (int i = n / 2 - 1; i >= 0; i--) {
				for (int j = 0; j < n / 2 - 1 - i; j++)
					System.out.print(" ");
				for (int j = 0; j < 2 * i + 1; j++)
					System.out.print("*");
				System.out.println("");
			}
		} else {
			for (int i = 0; i < n / 2; i++) {
				for (int j = 0; j < n / 2 - i; j++)
					System.out.print(" ");
				for (int j = 0; j < 2 * i + 1; j++)
					System.out.print("*");
				System.out.println("");
			}
			for (int i = 0; i < n; i++)
				System.out.print("*");
			System.out.println("");
			for (int i = n / 2 - 1; i >= 0; i--) {
				for (int j = 0; j < n / 2 - i; j++)
					System.out.print(" ");
				for (int j = 0; j < 2 * i + 1; j++)
					System.out.print("*");
				System.out.println("");
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		_18 theWay = new _18();
		System.out.print("请输入一个数字：");
		int n = input.nextInt();
		theWay.picture(n);
	}


}
