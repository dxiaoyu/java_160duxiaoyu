package com;

public class _12 {
	public static void main(String[] agrs) {
		for(int i=100;i<1000;i++) {
			int a,b,c;
			a=i/100;
			b=i/10-a*10;
			c=i-a*100-b*10;
			if(a*a*a+b*b*b+c*c*c==i) System.out.println(i+"为水仙花数");
		}
	}
}
