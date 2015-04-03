package ch5;

public class Rectangle {
	private double width, length;
	public Rectangle(double width, double length){
		this.width=width;
		this.length=length;
	}
	public double getArea(){
		return width*length;
	}
	public double GetCircumference(){
		return (width*2)+(length*2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(3.82, 8.65);
		System.out.println(r.getArea());
		System.out.println(r.GetCircumference());
	}
}
