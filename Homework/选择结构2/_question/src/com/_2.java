package com;
import java.util.Scanner;
public class _2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int type,num;
		System.out.println("����������Ҫ�Ļ�ɫ��1.���� 2.���� 3.���� 4.÷��");
		type = input.nextInt();
		System.out.print("����������Ҫ�ĵ�����");
		num = input.nextInt();
		System.out.print("���������Ϊ��");
		switch(type) {
		case 1 : System.out.print("����");break;
		case 2 : System.out.print("����");break;
		case 3 : System.out.print("����");break;
		case 4 : System.out.print("÷��");break;
		default : System.out.print("�������룬���������롣");break;
		}
		switch(num) {
		case 10 : System.out.println("J");break;
		case 11 : System.out.println("K");break;
		case 12 : System.out.println("L");break;
		default : System.out.print(num);break;
		}
	}
}
