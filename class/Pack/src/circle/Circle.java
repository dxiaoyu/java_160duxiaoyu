package circle;
/*
 *author @��С��
 *
 *2022��5��8��-����1:15:18
 */

public class Circle {
	double r;
	
	public Circle(double r) {
		this.r=r;
		System.out.println("��Բ�뾶Ϊ:"+r);
	}
	
	public void getArea() {
		System.out.println("��Բ�����Ϊ:"+(3.14*this.r*this.r));
	}
}
