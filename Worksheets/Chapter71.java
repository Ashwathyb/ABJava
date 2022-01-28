public class Chapter71 {
	
	public static void main (String[] args) {
		double aa = 1;
		double cc = 0;
		for (int i = 0; i < 10; i++) {
			aa = aa * 3.732;
			//System.out.println (aa);
			cc = aa * 100;
			int bb = (int) cc;
			System.out.println (bb/100.0);
		}
		
		
	}
}

