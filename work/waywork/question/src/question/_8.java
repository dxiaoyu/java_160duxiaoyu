package question;

/*
 *@author ��С��
 *
 *2022��4��20��-����11:01:39
 */
import java.util.Scanner;
public class _8 {
	public void add(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.print("1+2+...+"+n+"��֮Ϊ��"+sum);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		_8 theWay=new _8();
		System.out.print("������һ�����֣�");
		int a=input.nextInt();
		theWay.add(a);
	}


}
