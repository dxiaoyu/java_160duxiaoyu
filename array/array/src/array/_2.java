package array;
/*
 *author @��С��
 *
 *2022��4��29��-����6:39:32
 */
import java.util.Scanner;
public class _2 {

	public static void main(String[] args) {
		double[] grade=new double[10];
		Scanner input=new Scanner(System.in);
		for(int i=0;i < grade.length;i++) {
			System.out.print("������"+(i+1)+"��ѧ���ĳɼ���");
			grade[i]=input.nextDouble();
		}
		for(double n:grade) {
			System.out.println("ѧ���ĳɼ���"+n);
		}
	}

}
