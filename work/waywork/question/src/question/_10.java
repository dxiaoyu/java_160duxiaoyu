package question;

/*
 *@author ��С��
 *
 *2022��4��20��-����11:02:47
 */
import java.util.Scanner;
public class _10 {
	public char evaluate(int grade) {
		char arr='0';
		grade=grade/10;
		switch(grade) {
		case 10:
		case 9 :arr='A';break;
		case 8 :arr='B';break;
		case 7 :arr='C';break;
		case 6 :arr='D';break;
		default:arr='F';break;
		}
		return arr;
	}
	public static void main(String[] agrs) {
		Scanner input=new Scanner(System.in);
		_10 theWay=new _10();
		System.out.print("������ѧ���ĳɼ���");
		int grade =input.nextInt();
		char c=theWay.evaluate(grade);
		switch(c) {
		case 'A':System.out.println("��");break;
		case 'B':System.out.println("��");break;
		case 'C':System.out.println("��");break;
		case 'D':System.out.println("����");break;
		default :System.out.println("������");break;
		}
	}

}
