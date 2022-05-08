package com;
/*
 *author @杜小雨
 *
 *2022年5月7日-下午9:08:53
 */
import java.util.Scanner;
public class Student1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);//学生1
		System.out.println("输入学生1的姓名，学号，年龄：");
		String name=input.next();
		int number=input.nextInt();
		int age=input.nextInt();
	    student one=new student(number,name,age);
	    one.eat();
	    one.learn();
	    one.playBall();
	    
	    System.out.println("输入学生2的姓名，学号，年龄：");//学生2
	    name=input.next();
		number=input.nextInt();
		age=input.nextInt();
	    student two=new student(number,name,age);
	    two.eat();
	    two.learn();
	    two.playBall();

	}

}
