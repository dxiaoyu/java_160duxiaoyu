
package com;
/*
 *@author 杜小雨
 *
 *2022年4月26日-下午7:23:51
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
		System.out.println("请输入两个整数：");
		long a=input.nextLong();
		long b=input.nextLong();
		theWay.sub(a, b);
		System.out.println("请输入两个实数：");
		float c=input.nextFloat();
		float d=input.nextFloat();
		theWay.sub(c, d);
		System.out.println("请输入两个实数：");
		double e=input.nextDouble();
		double f=input.nextDouble();
		theWay.sub(e, f);
	}

}
