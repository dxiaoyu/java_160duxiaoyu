package circle;
/*
 *author @��С��
 *
 *2022��5��8��-����1:17:46
 */

import java.util.Scanner;

public class circleTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("������Բ�İ뾶:");
		double r=input.nextDouble();
		Circle one=new Circle(r);
		one.getArea();
	}

}
