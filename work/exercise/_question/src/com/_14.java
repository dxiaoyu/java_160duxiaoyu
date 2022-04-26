package com;

public class _14 {
	public static void main(String[] agrs) {
		int n=0;
		int sum=0;
		for(int i=0;i<10;i++) {
			n=(int)(Math.random()*6)+1;
			System.out.print("第"+(i+1)+"次:"+n+"  ");
			if(n==4) {System.out.println("跳过");i=i-1;continue;}
			else System.out.println("");
			sum=sum+n;
		}
		System.out.println("总分为"+sum);
	}
}
