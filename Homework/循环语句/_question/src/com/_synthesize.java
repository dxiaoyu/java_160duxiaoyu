package com;
import java.util.Scanner;
public class _synthesize {
	public static void main(String[] agrs) {
		int n=0;
		System.out.println("��ѡ�������Ϸģʽ��1.����20�� 2.��������20��");
		Scanner input =new Scanner(System.in);
		n=input.nextInt();
		int win=0;
		int lose=0;
		int dogfall=0;
		int sum=0;
		int fault=0;
		if(n==1) {
			while(sum<=20) {
				int player,computer;
				System.out.println("������������ģ�1.ʯͷ 2.���� 3.��");
				player=input.nextInt();
				System.out.print("��ҳ�����:");
				switch (player) {
				case 1 : System.out.println("ʯͷ");break;
				case 2 : System.out.println("����");break;
				case 3 : System.out.println("��");break;
				default : System.out.println("�������룬����������");break;
				}
				computer=(int)(Math.random()*3)+1;
				System.out.print("���Գ�����:");
				switch (computer) {
				case 1 : System.out.println("ʯͷ");break;
				case 2 : System.out.println("����");break;
				case 3 : System.out.println("��");break;
				default : System.out.println("�������룬����������");fault=fault+1;break;
				}
				int result=player-computer;
				switch(result) {
				case 0 : System.out.println("ƽ��");dogfall=dogfall+1;break;
				case -1:
				case 2 :System.out.println("���ʤ����");win=win+1;break;
				default :System.out.println("����ʤ����");lose=lose+1;break;
				}
				sum=sum+1;
			}
		}else {
			while(lose<=20) {
				int player,computer;
				System.out.println("������������ģ�1.ʯͷ 2.���� 3.��");
				player=input.nextInt();
				System.out.print("��ҳ�����:");
				switch (player) {
				case 1 : System.out.println("ʯͷ");break;
				case 2 : System.out.println("����");break;
				case 3 : System.out.println("��");break;
				default : System.out.println("�������룬����������");break;
				}
				computer=(int)(Math.random()*3)+1;
				System.out.print("���Գ�����:");
				switch (computer) {
				case 1 : System.out.println("ʯͷ");break;
				case 2 : System.out.println("����");break;
				case 3 : System.out.println("��");break;
				default : System.out.println("�������룬����������");break;
				}
				int result=player-computer;
				switch(result) {
				case 0 : System.out.println("ƽ��");dogfall=dogfall+1;break;
				case -1:
				case 2 :System.out.println("���ʤ����");win=win+1;break;
				default :System.out.println("����ʤ����");lose=lose+1;break;
				}
				sum=sum+1;
			}
		}
		int grade =win*10;
		System.out.println("��Ϸ������������"+grade+"��");
		System.out.println("��һ��������"+sum+"����Ϸ");
		System.out.println("��ʤ��"+win+"����Ϸ");
		System.out.println("ƽ����"+dogfall+"����Ϸ");
		System.out.println("ʧ����"+lose+"����Ϸ");
		System.out.println("��������"+fault+"����Ϸ");
	}
}
