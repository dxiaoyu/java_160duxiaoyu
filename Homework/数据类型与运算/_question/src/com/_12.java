package com;

import java.util.Scanner;

public class _12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������һ�����֣�");
		double a=input.nextDouble();
		System.out.print("������ڶ������֣�");
		double b=input.nextDouble();
		System.out.println("��һ������Ϊ"+a+"�ڶ�������Ϊ"+b);
		double c;
		c=a;
		a=b;
		b=c;
		System.out.println("�����󣬵�һ������Ϊ"+a+"�ڶ�������Ϊ"+b);
}
}
