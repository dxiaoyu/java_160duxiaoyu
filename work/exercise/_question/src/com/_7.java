package com;

import java.util.Scanner;

public class _7 {
	public static void main(String[] agrs) {//ps����Ϊ����ֻ�е����У������������2x-1�е����Ρ�
		System.out.print("������һ����Ȼ��:");
		Scanner input =new Scanner(System.in);
		int x=input.nextInt();
		for(int n=x-1;n>0;n--) {System.out.print(" ");}//��ӡ��x��
		System.out.print("*");
		System.out.println("");
		for(int i=0;i<x-1;i++) {
			for(int n=x-2-i;n>0;n--) {System.out.print(" ");}
			System.out.print("*");
			for(int m=0;m<2*i+1;m++) {System.out.print(" ");}
			System.out.print("*");
			System.out.println("");
		}
		for(int i=0;i<x-2;i++) {//��ӡ����x-1��
			for(int n=0;n<i+1;n++) {System.out.print(" ");}
			System.out.print("*");
			for(int m=0;m<2*(x-2-i)-1;m++) {System.out.print(" ");}
			System.out.print("*");
			System.out.println("");
		}
		for(int n=x-1;n>0;n--) {System.out.print(" ");}
		System.out.print("*");
	}
}
