public class Pr9 {
	
	public static int Mean (int [ ] array) {
		
		int sum = 0;
		for (int i = 0; i < array.length; i ++) {
			
			sum = sum + array [ i ];
		} 
		int mean = sum / array.length;
		
		return mean;
	}
	
	public static int [ ] random ( ) {
		
		for (int i = 0; i < 100; i ++) {
			
			double xx = Math.random ( ) * 6;
			
			int yy = (int)(xx + 1);
			
			array [i] = yy;
			
		}
		
	}
	//I'm not sure how to tackle 9.3 or 9.4
	
	public static void main (String[] args) {
		
		int [ ] array = new int array [ 100 ]; //Gives me an error and I don't know why
		
		for (int c = 0; c < 100; c ++) {
			
			array [ c ] = random ( ); //puts the randomly generated number into the array
		}
		
		System.out.println (Mean (array)); //Should give you the average had the array been created properly
		
		int [ ] x = new int [SIZE];
		
	}
	
	public final static int SIZE = 1000;
}

