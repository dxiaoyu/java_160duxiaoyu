package com;

import java.util.Scanner;

public class _10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������һ�����֣�");
		double a=input.nextDouble();
		System.out.print("������ڶ������֣�");
		double b=input.nextDouble();
		boolean c;
	    c=(a>b)?true:false;
	    if(c==true) {System.out.print(a);}
	    else {System.out.print(b);}
}
}
