package question;

/*
 *@author 杜小雨
 *
 *2022年4月20日-上午11:01:14
 */
import java.util.Scanner;
public class _7 {
	public double absouteValue(double a) {
		if(a<0)a=-a;
		return a;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		_7 theWay=new _7();
		System.out.print("请输入一个数字：");
		double a=input.nextDouble();
		double absolute=theWay.absouteValue(a);
		System.out.print(a+"的绝对值为"+absolute);

	}


}
