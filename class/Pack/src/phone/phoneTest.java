package phone;
/*
 *author @杜小雨
 *
 *2022年5月8日-下午12:38:25
 */

import java.util.Scanner;

public class phoneTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入手机的品牌,颜色,价格:");
		String brand = input.next();
		String color = input.next();
		int price = input.nextInt();
		phone one = new phone(brand, color, price);
		one.sendMessage();
		one.ringUp();
	}
}
