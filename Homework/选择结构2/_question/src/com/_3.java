package com;
import java.util.Scanner;
public class _3 {
	public static void main(String[] agrs) {
		int x,y;
		Scanner input = new Scanner(System.in);
		System.out.println("������������ eg 1 2");
		x = input.nextInt();
		y = input.nextInt();
		System.out.println("��ѡ��һ��������ʽ��1.+ 2.- 3.* 4./ 5.%");
		int z=input.nextInt();
		double result;
		switch(z) {
		case 1 : result=x+y;System.out.println(result);break;
		case 2 : result=x-y;System.out.println(result);break;
		case 3 : result=x*y;System.out.println(result);break;
		case 4 : result=x/y;System.out.println(result);break;
		case 5 : result=x%y;System.out.println(result);break;
		}
	}
}
