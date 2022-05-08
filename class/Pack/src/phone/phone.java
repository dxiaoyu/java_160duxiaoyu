package phone;
/*
 *author @杜小雨
 *
 *2022年5月8日-下午12:44:22
 */

import java.util.Scanner;

public class phone {
	String brand;
	String color;
	int price;

	public phone(String brand,String color,int price) {
		this.brand=brand;
		this.color=color;
		this.price=price;
		System.out.println("品牌:"+brand);
		System.out.println("颜色:"+color);
		System.out.println("价格:"+price);
	}

	public void ringUp() {
		System.out.println("手机能打电话");
	}

	public void sendMessage() {
		System.out.println("手机能发短信");
	}

}
