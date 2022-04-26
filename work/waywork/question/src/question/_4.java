package question;

/*
 *@author 杜小雨
 *
 *2022年4月20日-上午10:59:53
 */
import java.util.Scanner;
public class _4 {
	public double cube(double a) {
		double n=a*a*a;
		return n;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		_4 theWay=new _4();
		System.out.print("请输入一个数字：");
		double a=input.nextDouble();
		double b=theWay.cube(a);
		System.out.print(a+"的三次方为："+b);

	}

}
