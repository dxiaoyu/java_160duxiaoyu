package com;
import java.util.Scanner;
public class _6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���������ĳɼ�");
		int Chinese=input.nextInt();
		System.out.print("��������ѧ�ɼ�");
		int Math=input.nextInt();
		System.out.print("������Ӣ��ɼ�");
		int English=input.nextInt();
		int sum;
		double average;
		sum=Chinese+Math+English;
		average=(Chinese+Math+English)/3.0;
		System.out.println("������ĳɼ�Ϊ"+Chinese);
		System.out.println("�����ѧ�ɼ�Ϊ"+Math);
		System.out.println("���Ӣ��ɼ�Ϊ"+English);
		System.out.println("����ܳɼ�Ϊ"+sum);
		System.out.println("���ƽ����Ϊ"+average);
	}
}
