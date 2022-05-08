package circle;
/*
 *author @杜小雨
 *
 *2022年5月8日-下午1:15:18
 */

public class Circle {
	double r;
	
	public Circle(double r) {
		this.r=r;
		System.out.println("该圆半径为:"+r);
	}
	
	public void getArea() {
		System.out.println("该圆的面积为:"+(3.14*this.r*this.r));
	}
}
