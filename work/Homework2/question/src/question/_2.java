package question;

import java.util.Scanner;

/*
*@author ��С��
*
*2022��4��13��-����6:36:30
*/

public class _2 {
	public static void main(String[] agrs) {
		System.out.print("������ʮ����������:");
		Scanner input=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<10;i++) {
			int num=input.nextInt();
			sum=sum+num;
		}
		System.out.println(sum);
	}
}
