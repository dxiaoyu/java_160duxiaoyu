package com;
public class _11 {
	public static void main(String[] agrs) {
		double high=100;
		double sum =high;
		for(int i=0;i<10;i++) {
			sum=sum+high;
			high=high/2;
		}
		System.out.println("在第10次落地时，一共经过"+sum+"米");
		System.out.println("第10次反弹高度为："+high);
	}
}
