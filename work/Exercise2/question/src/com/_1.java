
package com;
/*
 *@author ��С��
 *
 *2022��4��26��-����7:23:51
 */
import java.util.Scanner;
public class _1 {
	public void sub(long a,long b) {
		double c=0;
		c=a-b;
		System.out.println("a-b="+c);
	}
	public void sub(double a,double b) {
		double c=0;
		c=a-b;
		System.out.println("a-b="+c);
	}
	public void sub(float a,float b) {
		double c=0;
		c=a-b;
		System.out.println("a-b="+c);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		_1 theWay=new _1();
		System.out.println("����������������");
		long a=input.nextLong();
		long b=input.nextLong();
		theWay.sub(a, b);
		System.out.println("����������ʵ����");
		float c=input.nextFloat();
		float d=input.nextFloat();
		theWay.sub(c, d);
		System.out.println("����������ʵ����");
		double e=input.nextDouble();
		double f=input.nextDouble();
		theWay.sub(e, f);
	}

}
