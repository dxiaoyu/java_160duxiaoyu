package com.school.computer;
/*
 *@author ��С��
 *
 *2022��5��15��-����9:06:53
 */

public class Computer {
	double num;
	
	public Computer(double num) {
		this.num=num;
	}
	
	public void print() {
		System.out.println(num);
	}
	
	public void add(double num) {
		this.num=this.num+num;
	}
	
	public void sub(double num) {
		this.num=this.num-num;
	}
	
	public void mul(double num) {
		this.num=this.num*num;
	}
	
	public void div(double num) {
		this.num=this.num/num;
	}
	
	public void clear() {
		this.num=0;
	}
}
