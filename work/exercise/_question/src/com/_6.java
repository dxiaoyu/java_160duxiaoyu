package com;
import java.util.Scanner;
public class _6 {
	public static void main(String[] agrs) {//ps����Ϊ����ֻ�е����У������������2x-1�е����Ρ�
		System.out.print("������һ����Ȼ��:");
		Scanner input =new Scanner(System.in);
		int x=input.nextInt();
		for(int i=0;i<x;i++) {//��ӡ��x��
			for(int n=x-1-i;n>0;n--) {System.out.print(" ");}
			for(int m=0;m<2*i+1;m++) {System.out.print("*");}
			System.out.println("");
		}
		for(int i=0;i<x-1;i++) {//��ӡ����x-1��
			for(int n=0;n<i+1;n++) {System.out.print(" ");}
			for(int m=0;m<2*(x-2-i)+1;m++) {System.out.print("*");}
			System.out.println("");
		}
	}
}
