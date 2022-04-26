package question;

/*
 *@author 杜小雨
 *
 *2022年4月20日-上午11:03:15
 */
import java.util.Scanner;
public class _11 {
	public int getCode(char str) {
		int a=(int)(str);
		return a;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		_11 theWay=new _11();
		System.out.print("请输入一个字符：");
		char str=input.next().charAt(0);
		int c =theWay.getCode(str);
		System.out.print(str+"的acs码之为:"+c);
	}

}
