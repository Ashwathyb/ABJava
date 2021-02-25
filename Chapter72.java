public class Chapter72 {
	
	public static void main (String[] args) {
		
		int a = 10;
		double bb = 1;
		for ( int i = 1; i < 10; i ++) {
			bb = bb * 3.732;
			String x = pad (bb, a);
			System.out.println (x);
		}
		
	}
	
	static String pad (double number, int width) {
		String aligned = " " + number;
		while ( aligned.indexOf ('.') < width ) {
			aligned = " " + aligned;
		}
		return aligned;
	}
}

