package question;

/*
 *@author ��С��
 *
 *2022��4��20��-����11:00:21
 */
import java.util.Scanner;
public class _5 {
	public double calcCircle(double r) {
		double area=3.14*r*r;
		return area;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		_5 theWay=new _5();
		System.out.print("������Բ�İ뾶��");
		double r=input.nextDouble();
		double area = theWay.calcCircle(r);
		System.out.println("Բ���:"+area);
	}

}
