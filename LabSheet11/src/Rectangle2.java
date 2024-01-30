
public class Rectangle2 implements Shape2 {
	
	private double width,length;
	
	Rectangle2(double width, double length){
		this.width=width;
		this.length=length;
	}
	@Override
	public double getArea() {
		return this.width*this.length;
	}
	public double getWidth() {
		return this.width=width;
	}
	public double getLength() {
		return this.length=length;
	}
	public String toString() {
		return "Rectangle[width= "+this.width+",length = "+this.length+","+super.toString()
          +"]";	
          }
	
}
