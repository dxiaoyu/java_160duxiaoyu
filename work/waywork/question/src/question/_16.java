package question;

/*
 *@author ��С��
 *
 *2022��4��20��-����11:03:55
 */
import java.util.Scanner;
public class _16 {
	public void getprint(int n) {
		if (n % 2 == 0) {
			for (int i = 2; i < n; i=i+2) {
				System.out.print("1/" + i + "+");
			}
			System.out.print("1/" + n);
		}else {
			for(int i=3;i<n;i=i+2) {
				System.out.print("1/" + i + "+");
			}
			System.out.print("1/" + n);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		_16 theWay = new _16();
		System.out.print("������һ�����֣�");
		int n = input.nextInt();
		theWay.getprint(n);
	}


}
