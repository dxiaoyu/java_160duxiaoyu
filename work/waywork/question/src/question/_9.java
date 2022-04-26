package question;

/*
 *@author 杜小雨
 *
 *2022年4月20日-上午11:02:27
 */
import java.util.Scanner;
public class _9 {
	public double cubeVolume(double a,double b,double c) {
		double volume=a*b*c;
		return volume;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		_9 theWay=new _9();
		System.out.print("请输入长方体的长、宽、高：");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
        double volume=theWay.cubeVolume(a, b, c);
        System.out.print("该长方体的体积为："+volume);
	}


}
