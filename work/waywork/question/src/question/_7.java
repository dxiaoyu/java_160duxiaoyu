package question;

/*
 *@author ��С��
 *
 *2022��4��20��-����11:01:14
 */
import java.util.Scanner;
public class _7 {
	public double absouteValue(double a) {
		if(a<0)a=-a;
		return a;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		_7 theWay=new _7();
		System.out.print("������һ�����֣�");
		double a=input.nextDouble();
		double absolute=theWay.absouteValue(a);
		System.out.print(a+"�ľ���ֵΪ"+absolute);

	}


}
