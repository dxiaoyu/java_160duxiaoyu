package question;

/*
 *@author ��С��
 *
 *2022��4��20��-����10:59:53
 */
import java.util.Scanner;
public class _4 {
	public double cube(double a) {
		double n=a*a*a;
		return n;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		_4 theWay=new _4();
		System.out.print("������һ�����֣�");
		double a=input.nextDouble();
		double b=theWay.cube(a);
		System.out.print(a+"�����η�Ϊ��"+b);

	}

}
