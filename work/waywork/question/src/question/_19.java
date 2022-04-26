package question;

/*
 *@author 杜小雨
 *
 *2022年4月20日-上午11:04:19
 */
import java.util.Scanner;
public class _19 {
	public void picture(int n) {
		if (n % 2 == 0) {
			for (int i = 0; i < n / 2 - 1; i++)
				System.out.print(" ");
			System.out.println("*");
			for (int i = 1; i < n / 2; i++) {
				for (int j = 0; j < n / 2 - 1 - i; j++)
					System.out.print(" ");
				System.out.print("*");
				for (int j = 0; j < 2 * i - 1; j++)
					System.out.print(" ");
				System.out.print("*");
				System.out.println("");
			}
			for (int i = n / 2 - 1; i >= 1; i--) {
				for (int j = 0; j < n / 2 - 1 - i; j++)
					System.out.print(" ");
				System.out.print("*");
				for (int j = 0; j < 2 * i - 1; j++)
					System.out.print(" ");
				System.out.print("*");
				System.out.println("");
			}
			for (int i = 0; i < n / 2 - 1; i++)
				System.out.print(" ");
			System.out.print("*");
		} else {
			for (int i = 0; i < n / 2; i++)
				System.out.print(" ");
			System.out.println("*");
			for (int i = 1; i <= n / 2 - 1; i++) {
				for (int j = 0; j < n / 2 - i; j++)
					System.out.print(" ");
				System.out.print("*");
				for (int j = 0; j < 2 * i - 1; j++)
					System.out.print(" ");
				System.out.print("*");
				System.out.println("");
			}
			System.out.print("*");
			for (int i = 0; i < n - 2; i++)
				System.out.print(" ");
			System.out.print("*");
			System.out.println("");
			for (int i = n / 2 - 1; i >= 1; i--) {
				for (int j = 0; j < n / 2 - i; j++)
					System.out.print(" ");
				System.out.print("*");
				for (int j = 0; j < 2 * i - 1; j++)
					System.out.print(" ");
				System.out.print("*");
				System.out.println("");
			}
			for (int i = 0; i < n / 2; i++)
				System.out.print(" ");
			System.out.print("*");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		_19 theWay = new _19();
		System.out.print("请输入一个数字：");
		int n = input.nextInt();
		theWay.picture(n);
	}


}
