package question;

/*
 *@author ��С��
 *
 *2022��4��20��-����10:58:42
 */
import java.util.Scanner;
public class _2 {
	public 	void print1ToN(int n) {
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		_2 theWay=new _2();
		System.out.print("������һ����Ȼ��n:");
		int n=input.nextInt();
		theWay.print1ToN(n);
	}

}
