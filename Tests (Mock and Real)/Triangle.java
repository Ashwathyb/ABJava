public class Triangle {
	
	public static void main (String[] args) {
		
		private double base;
		private double height;
		private double side1;
		private double side2;
		private double side3;
		
	}
	
	public Triangle ( ) {
		
		this.name = "t";
		this.base = 1;
		this.height = 1;
		this.side1 = 1;
		this.side2 = 1;
		this.side3 = 1;
		
	}
	
	public Triangle (String name, double b, double h, double s1, double s2,double s3) {
		
		this.name = name;
		this.base = b;
		this.height = h;
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
		
	}
	
	public double compareTo (Triangle t) {
		
		double area1 = 0.5*this.base*this.height;
		double area2 = 0.5*t.base*t.height;
		return area1 - area2;
		
	}
	
	public boolean equals (Triangle t) {
		
		return this.base == t.base && this.height == t.height;
		
	}
	
	public double getArea ( ){
		
		double area = 0/5*this.base*this.height;
		return area;
		
	}
	
	public double getBase ( ) {
		
		double base = this.base;
		return base;
		
	}
	
	public double getHeight ( ) {
		
		double height = this.height;
		return height;
		
	}
	
	public double getPerimeter ( ) {
		
		double perimeter = side1+side2+side3;
		return perimeter;
		
	}
	
	public double getSide1 ( ) {
		
		double side = this.side1;
		return side;
	}
	
	public double getSide2 () {
		
		double side = this.side2;
		return side;
		
	}
	
	public double getSide3 ( ) {
		
		double side = this.side3;
		return side;
		
	}
	
	/*public String toString ( ) {
		
		
		
	}*/
}

