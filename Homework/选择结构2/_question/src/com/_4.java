package com;
import java.util.Scanner;
public class _4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("��������ķ�����");
		double grade = input.nextDouble();
		int a = (int)(grade/10);
		switch(a) {
		case 10:
		case 9 :System.out.print("����");break;
		case 8 :System.out.print("����");break;
		case 7 :System.out.print("�е�");break;
		case 6 :System.out.print("����");break;
		default:System.out.print("������");break;
		}
	}
}
