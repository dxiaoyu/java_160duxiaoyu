package circle;
/*
 *author @杜小雨
 *
 *2022年5月8日-下午1:17:46
 */

import java.util.Scanner;

public class circleTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入圆的半径:");
		double r=input.nextDouble();
		Circle one=new Circle(r);
		one.getArea();
	}

}
