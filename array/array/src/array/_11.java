package array;
/*
 *author @杜小雨
 *
 *2022年4月29日-下午7:14:49
 */

import java.util.Scanner;

public class _11 {

	public static void main(String[] args) {
		double[] grade=new double[5];
		Scanner input=new Scanner(System.in);
		for(int i=0;i < grade.length;i++) {
			System.out.print("请输入"+(i+1)+"个学生的成绩：");
			grade[i]=input.nextDouble();
		}
		double sum,max,min;
		max=sum=0;
		min=100;
		for(int i=0;i<grade.length;i++) {
			System.out.print("请输入"+(i+1)+"个学生的成绩：");
			System.out.println("学生的成绩："+grade[i]);
			sum+=grade[i];
			if(grade[i]>max)max=grade[i]; 
			if(min>grade[i])min=grade[i];
		}
		for(double n:grade) {
			System.out.println("学生的成绩："+n);
		}
		System.out.println("最高分："+max);
		System.out.println("最低分："+min);
		System.out.println("平均分："+sum/5);
	}
}

