public class Pr8
{
	
	static boolean good(int a, int b) {	
		int x = a * b + 1;
		int y = (int) (Math.sqrt(x)+.5);
		return ( y * y == x );
	}
	
	public static void main( String args[]) {
		for (int i = 1; i < 200; i++) {
			
			for (int j = i; j < 200; j++) {
				
				for (int k = j; k < 200; k++) {
					
					for (int c = k; c < 200; c ++) {
					
						if ( good(i,j) && good(j,k) && good(i,k) && good(i, c) && good(j, c) && good (k, c) ) {
						
							IBIO.output( i + " " + j + " " + k + " " + c );
						}
					
					}
						
				}
			}
		}
	
	}
	
}
/* With duplicates:
*for (int j = 1; j < 200; j++) {
				
				for (int k = 1; k < 200; k++) {
					
					for (int c = 1; c < 200; c ++) {
					
						if ( good(i,j) && good(j,k) && good(i,k) && good(i, c) && good(j, c) && good (k, c) ) {
						
							IBIO.output( i + " " + j + " " + k + " " + c );
						}
					
					}
						
				}
			}*/
