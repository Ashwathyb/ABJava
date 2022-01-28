public class Chapter63 {
	
	public static String stars (int n) {
		String stars = "";
		for (int i = 0; i < n; i++) {
			stars = stars + "*";
		}
		return stars;
		
	}
	public static String spaces (int n) {
		String spaces = "";
		for (int i = 0; i < n; i++) {
			spaces = spaces + " ";
		}
		return spaces;
	}
	public static void main (String[] args) {
		int num = IBIO.inputInt ("Enter the number of lines ");
		String x = stars (num);
		for (int i = num-1; i != 0; i--) {
			System.out.println (spaces(i) + x);
		}
		for (int i = 0; i < num; i++) {
			System.out.println (spaces(i) + x);
		}
		
	}
}

