package question;

/*
 *@author ��С��
 *
 *2022��4��20��-����11:02:27
 */
import java.util.Scanner;
public class _9 {
	public double cubeVolume(double a,double b,double c) {
		double volume=a*b*c;
		return volume;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		_9 theWay=new _9();
		System.out.print("�����볤����ĳ������ߣ�");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
        double volume=theWay.cubeVolume(a, b, c);
        System.out.print("�ó���������Ϊ��"+volume);
	}


}
