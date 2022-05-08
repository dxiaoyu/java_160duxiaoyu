package com;
/*
 *author @杜小雨
 *
 *2022年5月7日-下午9:08:53
 */

public class student {

	int number;
	String name;
	int age;
	
	public student(int number,String name,int age) {
		this.number=number;
		this.name=name;
		this.age=age;
		System.out.println("学号:"+this.number);
		System.out.println("姓名:"+this.name);
		System.out.println("年龄:"+this.age);
	}
	public void eat() {
		System.out.println(this.name + "吃饭.");
	}

	public void learn() {
		System.out.println(this.name + "学习.");
	}

	public void playBall() {
		System.out.println(this.name + "打球.");
	}

}
