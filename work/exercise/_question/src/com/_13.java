package com;
public class _13 {
	public static void main(String[] agrs) {
		int n=0;
		int m=0;
		for(int i=0;i<10;i++) {
			n=(int)(Math.random()*6)+1;
			System.out.println("��"+(i+1)+"��:"+n);
			if(n==6) { 
				System.out.print("��Ӯ��");
				break;
				}
			m=m+1;
		}
		if(m==10)System.out.print("������");
	}
}
