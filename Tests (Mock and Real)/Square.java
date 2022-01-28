public class Square {
	
	public static void main (String[] args) {
		
		private double side;
		
	}
	
	public Square ( ) {
		
		this.name = "S";
		this.side = 1;	
		
		
	}
	
	public Square (String name, double side) {
		
		this.name = name;
		this.side = side;	
		
	}
	
	public double compareTo (Square s) {
		
		double area1 = this.side*this.side;
		double area2 = s.side*s.side;
		return area1 - area2;
		
	}
	
	public boolean equals (Square s) {
		
		return this.side == s.side;
		
	}
	
	public double getArea ( ) {
		
		double area = this.side * this.side;
		return area;
		
	}
	
	public double getPerimeter ( ) {
		
		double perimeter = this.side * 4;
		return perimeter;
		
		
	}
	
	public double getSide ( ) {
		
		return this.side;
		
	}
	
	public double setSide (double s) {
		
		this.side = s;
		return this.side;
		
	}
	
	/*public String toString () {
		
		
		
	}*/
}

