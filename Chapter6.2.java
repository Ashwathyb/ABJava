public class Chapter6.2 {
	
	public static void main (String[] args) {
	
	System.out.println ("Chapter 6.2");
	System.out.println ("   ");
	
	int num = IBIO.inputInt ("Enter the number of lines - ");
		String aa = stars(num);
		
		for (int i = 0; i < num; i++) {
			System.out.println (stars (i + 1));
		}
		for (int i = 0; i != 0; i--) {
			System.out.println (stars (i - 1));
		}
	}
	
	static String stars (int n)
	{
		String xx = " ";
		for (int i = 0; i < n; i ++) {
			xx = xx + "*";
		}
		return xx;
	}	
	
	}


