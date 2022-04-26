package _question;

import java.util.Scanner;

public class _5 {
	public static void main(String[] agrs) {
		Scanner input =new Scanner(System.in);
		int grade;
		System.out.print("请输入一个数：");
		grade=input.nextInt();
		grade=grade/10;
		if(grade<=100&&grade>=0) {
	        switch(grade) {
	        case 10:
	        case 9 : System.out.println("优");break;
	        case 8 : System.out.println("良");break;
	        case 7 : System.out.println("中");break;
	        case 6 : System.out.println("及格");break;
	        default: System.out.println("不及格");break;
	        }
		}
		else System.out.println("错误输入");
	}
}
