package com;
public class _11 {
	public static void main(String[] agrs) {
		double high=100;
		double sum =high;
		for(int i=0;i<10;i++) {
			sum=sum+high;
			high=high/2;
		}
		System.out.println("�ڵ�10�����ʱ��һ������"+sum+"��");
		System.out.println("��10�η����߶�Ϊ��"+high);
	}
}
