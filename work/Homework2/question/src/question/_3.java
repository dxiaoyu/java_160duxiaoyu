package question;

import java.util.Scanner;

/*
*@author ��С��
*
*2022��4��13��-����6:39:49
*/

public class _3 {
	public static void main(String[] agrs) {
		Scanner input=new Scanner(System.in);
		int sum=0;
		while(sum<100) {
			System.out.print("������1~10���ڵ�����:");
			int num=input.nextInt();
			sum=sum+num;
		}
		System.out.println(sum);

 }
}
