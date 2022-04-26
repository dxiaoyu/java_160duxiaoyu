package question;

/*
 *@author 杜小雨
 *
 *2022年4月20日-上午11:02:47
 */
import java.util.Scanner;
public class _10 {
	public char evaluate(int grade) {
		char arr='0';
		grade=grade/10;
		switch(grade) {
		case 10:
		case 9 :arr='A';break;
		case 8 :arr='B';break;
		case 7 :arr='C';break;
		case 6 :arr='D';break;
		default:arr='F';break;
		}
		return arr;
	}
	public static void main(String[] agrs) {
		Scanner input=new Scanner(System.in);
		_10 theWay=new _10();
		System.out.print("请输入学生的成绩：");
		int grade =input.nextInt();
		char c=theWay.evaluate(grade);
		switch(c) {
		case 'A':System.out.println("优");break;
		case 'B':System.out.println("良");break;
		case 'C':System.out.println("中");break;
		case 'D':System.out.println("及格");break;
		default :System.out.println("不及格");break;
		}
	}

}
