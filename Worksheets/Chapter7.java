public class Chapter7 {
	
	public static void main (String[] args) {
		for (int i = 1; i < 20; i++) {
			
			String s = pad(i,10) + pad(i*i,10) + pad(i*i*i,10);
			System.out.println (s);
		}
		
	}
	
	static String pad(int n, int tab) {
	String st = " " + n;
	while ( st.length () < tab ) {
		st = "  " + st;
	}
	return st;
	}
	
}
