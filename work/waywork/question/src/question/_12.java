package question;

/*
 *@author ��С��
 *
 *2022��4��20��-����11:03:23
 */
import java.util.Scanner;
public class _12 {
	public boolean isFlower(int num) {
		int a=num/100;
		int b=(num-a*100)/10;
		int c=num-a*100-b*10;
		boolean r=false;
		if(num==a*a*a+b*b*b+c*c*c) r=true;
		return r;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		_12 theWay=new _12();
		System.out.print("������һ����λ����");
		int num=input.nextInt();
		boolean r =theWay.isFlower(num);
		System.out.print(num);
		System.out.println(r?"��ˮ�ɻ���":"����ˮ�ɻ���");
	}

}
