package com;

import java.util.Scanner;

public class _11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������һ�����֣�");
		double a=input.nextDouble();
		System.out.print("������ڶ������֣�");
		double b=input.nextDouble();
		System.out.print("��������������֣�");
		double c=input.nextDouble();
        double e;
        e=(a<b?a:b);
        e=(e<c?e:c);
        System.out.println("��С������Ϊ"+e);
}
}
