package com;
/*
 *author @��С��
 *
 *2022��5��7��-����9:08:53
 */
import java.util.Scanner;
public class Student1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);//ѧ��1
		System.out.println("����ѧ��1��������ѧ�ţ����䣺");
		String name=input.next();
		int number=input.nextInt();
		int age=input.nextInt();
	    student one=new student(number,name,age);
	    one.eat();
	    one.learn();
	    one.playBall();
	    
	    System.out.println("����ѧ��2��������ѧ�ţ����䣺");//ѧ��2
	    name=input.next();
		number=input.nextInt();
		age=input.nextInt();
	    student two=new student(number,name,age);
	    two.eat();
	    two.learn();
	    two.playBall();

	}

}
