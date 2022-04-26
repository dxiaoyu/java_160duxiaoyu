package com;

public class _12 {
	public static void main(String[] agrs) {
		int x=0;
		System.out.print("1~1000内的素数有：");
		for(int i=2;i<=1000;i++) {
			int m=0;
			for(int n=2;n<i;n++) {
				if(i%n==0) m=m+1;
			}
			if(m==0) {System.out.print(i+" ");x=x+1;}
			if(x==50) break;
		}
	}
}
