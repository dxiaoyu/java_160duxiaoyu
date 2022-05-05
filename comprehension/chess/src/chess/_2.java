package chess;
/*
 *author @��С��
 *
 *2022��5��5��-����9:53:20
 */
import java.util.Scanner;
public class _2 {
	public void printChessBoard(int[][] array) {
		for(int i=4;i<14;i++) {
			for(int j=4;j<14;j++) {
				if(array[i][j]==0)System.out.print("+");
				if(array[i][j]==1)System.out.print("*");
				if(array[i][j]==2)System.out.print("o");
			}
			System.out.println("");
		}
	}
	public int jugement(int[][] array) {
		int a=0;
		for(int i=4;i<14;i++) {
			for(int j=4;j<14;j++) {
				if(array[i][j]==array[i][j+1]&&array[i][j+1]==array[i][j+2]&&array[i][j+2]==array[i][j+3]&&array[i][j+3]==array[i][j+4]&&array[i][j+4]==1){System.out.print("���ӻ�ʤ");a=1;}
				if(array[i][j]==array[i][j+1]&&array[i][j+1]==array[i][j+2]&&array[i][j+2]==array[i][j+3]&&array[i][j+3]==array[i][j+4]&&array[i][j+4]==2){System.out.print("���ӻ�ʤ");a=1;}
				if(array[i][j]==array[i+1][j+1]&&array[i+1][j+1]==array[i+2][j+2]&&array[i+2][j+2]==array[i+3][j+3]&&array[i+3][j+3]==array[i+4][j+4]&&array[i+4][j+4]==1){System.out.print("���ӻ�ʤ");a=1;}
				if(array[i][j]==array[i+1][j+1]&&array[i+1][j+1]==array[i+2][j+2]&&array[i+2][j+2]==array[i+3][j+3]&&array[i+3][j+3]==array[i+4][j+4]&&array[i+4][j+4]==2){System.out.print("���ӻ�ʤ");a=1;}
				if(array[i][j]==array[i+1][j]&&array[i+1][j]==array[i+2][j]&&array[i+2][j]==array[i+3][j]&&array[i+3][j]==array[i+4][j]&&array[i+4][j]==1){System.out.print("���ӻ�ʤ");a=1;}
				if(array[i][j]==array[i+1][j]&&array[i+1][j]==array[i+2][j]&&array[i+2][j]==array[i+3][j]&&array[i+3][j]==array[i+4][j]&&array[i+4][j]==2){System.out.print("���ӻ�ʤ");a=1;}
			}
		}
		for(int i=4;i<14;i++) {
			for(int j=4;j<14;j++) {
				if(array[i][j]==array[i+1][j-1]&&array[i+1][j-1]==array[i+2][j-2]&&array[i+2][j-2]==array[i+3][j-3]&&array[i+3][j-3]==array[i+4][j-4]&&array[i+4][j-4]==1){System.out.print("���ӻ�ʤ");a=1;}
				if(array[i][j]==array[i+1][j-1]&&array[i+1][j-1]==array[i+2][j-2]&&array[i+2][j-2]==array[i+3][j-3]&&array[i+3][j-3]==array[i+4][j-4]&&array[i+4][j-4]==2){System.out.print("���ӻ�ʤ");a=1;}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int[][] chessBoard=new int[18][18];
		Scanner input=new Scanner(System.in);
		System.out.println("*��ʾ���� o��ʾ����(10*10����)");
		_2 theway=new _2();
		int a=0;
		while(true) {
			int i,j;
			i=j=0;
			System.out.println("�������������������");
			System.out.print("������:");
			i=input.nextInt();
			System.out.print("������:");
			j=input.nextInt();
			chessBoard[j+3][i+3]=1;
			theway.printChessBoard(chessBoard);
			a=theway.jugement(chessBoard);
			if(a==1)break;
			System.out.println("�������������������");
			System.out.print("������:");
			i=input.nextInt();
			System.out.print("������:");
			j=input.nextInt();
			chessBoard[j+3][i+3]=2;
			theway.printChessBoard(chessBoard);
			a=theway.jugement(chessBoard);
			if(a==1)break;
		}
	}

}
