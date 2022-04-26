package com;
import java.util.Scanner;
public class _6 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入你的成绩等级：");
		char grade=input.next().charAt(0);
		switch(grade) {
		case 65 :System.out.println("优秀");break;
		case 66 :
		case 67 :System.out.println("良好");break;
		case 68 :
		case 69 :System.out.println("及格");break;
		case 70 :System.out.println("不及格");break;
		default :System.out.println("错误输入，请重新输入");break;
		}
	}
}
