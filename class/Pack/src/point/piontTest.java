package point;
/*
 *author @杜小雨
 *
 *2022年5月8日-下午1:12:12
 */

import java.util.Scanner;

public class piontTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入点的横纵坐标:");
		int x=input.nextInt();
		int y=input.nextInt();
		Piont one=new Piont(x,y);
		one.printPoint();
	}

}
