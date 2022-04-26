package question;

/*
 *@author 杜小雨
 *
 *2022年4月20日-上午11:03:30
 */
import java.util.Scanner;
public class _13 {
	public double distance(double a,double b,double c,double d) {
		double distance=Math.sqrt((a-c)*(a-c)+(b-d)*(b-d));
		return distance;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		_13 theWay=new _13();
		System.out.println("请输入两个点的坐标");
		System.out.print("X1:");
		double a=input.nextDouble();
		System.out.print("Y1:");
		double b=input.nextDouble();
		System.out.print("X2:");
		double c=input.nextDouble();
		System.out.print("Y1:");
		double d=input.nextDouble();
		double longth=theWay.distance(a,b,c,d);
		System.out.println("两点间的距离为："+longth);
	}


}
