package com;
import java.util.Scanner;
public class _6 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("��������ĳɼ��ȼ���");
		char grade=input.next().charAt(0);
		switch(grade) {
		case 65 :System.out.println("����");break;
		case 66 :
		case 67 :System.out.println("����");break;
		case 68 :
		case 69 :System.out.println("����");break;
		case 70 :System.out.println("������");break;
		default :System.out.println("�������룬����������");break;
		}
	}
}
