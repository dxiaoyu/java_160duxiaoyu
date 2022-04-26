package _question;

import java.util.Scanner;

public class _4 {
	public static void main(String[] agrs) {
		Scanner input =new Scanner(System.in);
		int a;
		System.out.print("请输入一个数：");
		a=input.nextInt();
        switch(a) {
        case 1 : System.out.println("星期一");break;
        case 2 : System.out.println("星期二");break;
        case 3 : System.out.println("星期三");break;
        case 4 : System.out.println("星期四");break;
        case 5 : System.out.println("星期五");break;
        case 6 : System.out.println("星期六");break;
        case 7 : System.out.println("星期日");break;
        default: System.out.println("错误输入，请重新输入");break;
        }
	}
}
