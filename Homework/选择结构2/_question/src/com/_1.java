package com;
import java.util.Scanner;
public class _1 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
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
		case 0 : System.out.println("ƽ��");break;
		case -1:
		case 2 :System.out.println("���ʤ����");break;
		default :System.out.println("����ʤ����");break;
		}
	}
}
