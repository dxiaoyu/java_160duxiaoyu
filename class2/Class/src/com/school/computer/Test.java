package com.school.computer;
/*
 *@author 杜小雨
 *
 *2022年5月15日-下午9:13:12
 */

public class Test {

	public static void main(String[] args) {
		Computer c = new Computer(0);
		c.print();
		c.add(20);
		c.print();
		c.sub(6);
		c.print();
		c.mul(5);
		c.print();
		c.div(2);
		c.print();
		c.clear();
		c.print();
	}

}
