
/*
 *author @��С��
 *
 *2022��5��4��-����8:31:11
 */
import java.util.Scanner;

public class _1 {

	public static void main(String[] args) {
		double[][] array = new double[10][6];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.print("�������" + (i + 1) + "��ͬѧ��ѧ��:");
			array[i][0] = input.nextDouble();
			System.out.print("�������" + (i + 1) + "��ͬѧ�����ĳɼ�:");
			array[i][1] = input.nextDouble();
			System.out.print("�������" + (i + 1) + "��ͬѧ����ѧ�ɼ�:");
			array[i][2] = input.nextDouble();
			System.out.print("�������" + (i + 1) + "��ͬѧ������ɼ�:");
			array[i][3] = input.nextDouble();
			array[i][4] = array[i][1] + array[i][2] + array[i][3];
			array[i][5] = array[i][4] / 3;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("ѧ��:" + array[i][0]);
			System.out.println("���ĳɼ�:" + array[i][1]);
			System.out.println("��ѧ�ɼ�:" + array[i][2]);
			System.out.println("����ɼ�:" + array[i][3]);
			System.out.println("�ܷ�:" + array[i][4]);
			System.out.println("ƽ����:" + array[i][5]);
			System.out.println("");
		}
		int[] rank= {0,1,2,3,4,5,6,7,8,9};
		for(int i=0;i<9;i++) {
			for(int j=i+1;j<10;j++) {
				int a=0;
				if(array[rank[i]][4]<array[rank[j]][4]) {a=rank[i];rank[i]=rank[j];rank[j]=a;}
			}
		}
		for(int n:rank) {
			if(array[n][4]==array[0][4]) {
				System.out.println("��߷�");
				System.out.println("ѧ��:" + array[rank[0]][0] );
				System.out.println("���ĳɼ�:" + array[rank[0]][1]);
				System.out.println("��ѧ�ɼ�:" + array[rank[0]][2]);
				System.out.println("����ɼ�:" + array[rank[0]][3]);
				System.out.println("�ܷ�:" + array[rank[0]][4]);
				System.out.println("ƽ����:" + array[rank[0]][5]);
			}
		}
	}
}