package question;

/*
 *@author ��С��
 *
 *2022��4��20��-����11:00:46
 */
import java.util.Scanner;
public class _6 {
	public double calVolume(double r) {
		double volume=3.14*4/3*r*r*r;
		return volume;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		_6 theWay=new _6();
		System.out.print("������Բ�İ뾶��");
		double r=input.nextDouble();
		double volume =theWay.calVolume(r);
		System.out.println("�����:"+volume);


	}

}
