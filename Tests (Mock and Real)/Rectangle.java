public class Rectangle {
	
	public static void main (String[] args) {
		
		
		private double length;
		private double width;
	//rectangle (jj, 8, 9)
	
	}
	
	public Rectangle ( ) {
		
		this.name = "R";
		this.length = 1;
		this.width = 1;
		
	}
	
	public Rectangle (String name, double l, double w) {
		
		this.name = name;
		this.length = l;
		this.width = w;
		
		
		
	}
	
	public boolean equals (Rectangle r) {
		
		return this.length == r.length && this.width == r.width;
		
	}
	
	public double getArea ( ) {
		
		double area = this.length*this.width;
		return area;
		
	}
	
	public double getLength ( ) {
		
		return this.length;
		
	}
	
	public double getPerimeter ( ) {
		
		double perimeter = (2*this.length) + (2*this.breadth);
		return perimeter;
		
		
	}
	
	public double getWidth ( ) {
		
		return this.width;
		
	}
	
	public void setLength (double l) {
		
		this.length = l;
		//return this.length; -- incorrect
	}
	
	public void setWidth (double w) {
		
		this.width = w;
		//return this.width; -- incorrect
	}
	
	/*public String toString ( ) {
		
		
	}*/
	
}

