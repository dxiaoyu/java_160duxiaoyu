package question;

/*
 *@author ��С��
 *
 *2022��4��20��-����11:03:30
 */
import java.util.Scanner;
public class _13 {
	public double distance(double a,double b,double c,double d) {
		double distance=Math.sqrt((a-c)*(a-c)+(b-d)*(b-d));
		return distance;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		_13 theWay=new _13();
		System.out.println("�����������������");
		System.out.print("X1:");
		double a=input.nextDouble();
		System.out.print("Y1:");
		double b=input.nextDouble();
		System.out.print("X2:");
		double c=input.nextDouble();
		System.out.print("Y1:");
		double d=input.nextDouble();
		double longth=theWay.distance(a,b,c,d);
		System.out.println("�����ľ���Ϊ��"+longth);
	}


}
