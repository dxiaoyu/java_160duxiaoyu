package com;
/*
 *author @��С��
 *
 *2022��5��7��-����9:08:53
 */

public class student {

	int number;
	String name;
	int age;
	
	public student(int number,String name,int age) {
		this.number=number;
		this.name=name;
		this.age=age;
		System.out.println("ѧ��:"+this.number);
		System.out.println("����:"+this.name);
		System.out.println("����:"+this.age);
	}
	public void eat() {
		System.out.println(this.name + "�Է�.");
	}

	public void learn() {
		System.out.println(this.name + "ѧϰ.");
	}

	public void playBall() {
		System.out.println(this.name + "����.");
	}

}
