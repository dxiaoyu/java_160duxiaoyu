package question;

/*
 *@author 杜小雨
 *
 *2022年4月20日-上午11:00:46
 */
import java.util.Scanner;
public class _6 {
	public double calVolume(double r) {
		double volume=3.14*4/3*r*r*r;
		return volume;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		_6 theWay=new _6();
		System.out.print("请输入圆的半径：");
		double r=input.nextDouble();
		double volume =theWay.calVolume(r);
		System.out.println("球体积:"+volume);


	}

}
