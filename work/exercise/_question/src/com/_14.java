package com;

public class _14 {
	public static void main(String[] agrs) {
		int n=0;
		int sum=0;
		for(int i=0;i<10;i++) {
			n=(int)(Math.random()*6)+1;
			System.out.print("��"+(i+1)+"��:"+n+"  ");
			if(n==4) {System.out.println("����");i=i-1;continue;}
			else System.out.println("");
			sum=sum+n;
		}
		System.out.println("�ܷ�Ϊ"+sum);
	}
}
