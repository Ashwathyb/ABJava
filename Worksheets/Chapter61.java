public class Chapter61 {
	
	public static void main (String[] args) {
	
		System.out.println ("Part 6.1");
		System.out.println ("  ");
		int num = IBIO.inputInt ("Enter the number of lines - ");
		String aa = stars(num);
		
		for (int i = 0; i < num; i++) {
			IBIO.output (aa);
		}
	}
	
	static String stars (int n)
	{
		String xx = "          ";
		for (int i = 0; i < n; i ++) {
			xx = xx + "*";
		}
		return xx;
	}
		
	
}

