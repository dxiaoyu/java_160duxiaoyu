package array;
/*
 *author @��С��
 *
 *2022��4��29��-����7:14:49
 */

import java.util.Scanner;

public class _11 {

	public static void main(String[] args) {
		double[] grade=new double[5];
		Scanner input=new Scanner(System.in);
		for(int i=0;i < grade.length;i++) {
			System.out.print("������"+(i+1)+"��ѧ���ĳɼ���");
			grade[i]=input.nextDouble();
		}
		double sum,max,min;
		max=sum=0;
		min=100;
		for(int i=0;i<grade.length;i++) {
			System.out.print("������"+(i+1)+"��ѧ���ĳɼ���");
			System.out.println("ѧ���ĳɼ���"+grade[i]);
			sum+=grade[i];
			if(grade[i]>max)max=grade[i]; 
			if(min>grade[i])min=grade[i];
		}
		for(double n:grade) {
			System.out.println("ѧ���ĳɼ���"+n);
		}
		System.out.println("��߷֣�"+max);
		System.out.println("��ͷ֣�"+min);
		System.out.println("ƽ���֣�"+sum/5);
	}
}

