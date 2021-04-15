public class ArrrayPractise {
	
	public static void printArray (int [] array) {
		
		for (int element : array) { //for every integer in array, put it in element
			
			System.out.print (element + "  ");
		}
		
		System.out.println ( );
				
	}
	
	public static double Mean (int [ ] array) {
		
		double sum = 0;
		for (int i = 0; i < array.length; i ++) {
			
			sum = sum + array [ i ];
		} 
		double mean = sum / array.length;
		
		return mean;
	}
	
	public static int checking (int [ ] array, int n) { //occurences is a better word (also frequency)
		
		int checking = 0;
		
		for (int v = 0; v < array.length; v ++) { 
			
			if (array [v] == n) {
				
				checking = checking + 1;
				
			}
		}
		
		return checking;
	}
	
	public static int mode (int [ ] array) {
		
		int frequency = 0;
		
		int occurence = 0;
		
		int mode = 0;
				
		for (int i = 0; i < array.length; i ++) {
			
			if (frequency > occurence) {
				
				mode = array [ i ];
				
			}
			
			frequency = checking (array, i); //frequency of a term
						
			occurence = checking (array, mode); //frequency of the mode at that moment
			
			
			
		}
		
			return mode;
		
	}
		
		
		/*int occurences = 0; //a default value to be compared to when deciding the maximum occurence
		
		for (int i = 0; i < array.length; i ++) {
			
			for (int c = i; c < array.length; c ++) {
				
				int frequency = checking (array, i);
				
				if (frequency > occurences) {
					
					mode = array [ i ];
			
				}
				
				occurences = frequency;
				
			}
			
		}*/
		
		/* int temp;
		   for(int i=0;i<a.length-1;i++){

		   for(int j=0;j<a.length-1;j++){

				if(a[j] > a[j+1]){   // use < for Descending order

						temp = a[j+1];

						a[j+1] = a[j];

						a[j]=temp; */
						
		
	public static double median (int [ ] array) {
		
		double median = 0;
		
		int nextelement = 0;
		
		int thiselement = 0;
		
		if (array.length % 2 == 0) {
			
			thiselement = array [(array.length/2)];
			
			nextelement = array [(thiselement /*+ 1*/)];
			
			median = (thiselement + nextelement)/2;
			
		}
		
		else {
			
			median = array [((array.length /*+ 1*/)/2)];
			
		}
		
		return median;
	}
	
	public static void main (String[] args) {
		
		int [ ] bk = { 9, 8, 3, 7, 8, 6, 9, 4};
		
		int [ ] ss = { 9, 0, 2, 3, 0, 6, 2, 5};
		
		int [ ] jr = { 9, 7, 4, 2, 4, 1, 2, 6 };
		
		int [ ] ab = { 4, 5, 6, 7, 8}; //odd number array length for median trial
		
		
		int [ ] sb = { 1, 2, 3, 4, 5, 6}; //even number array length for median trial 
		
		printArray (bk);
		
		printArray (ss);
		
		System.out.print ("Mean of Array BK is  ");
		
		System.out.println (Mean(bk));
		
		System.out.print ("Mean of Array SK is  ");
		
		System.out.println (Mean(ss));
		
		System.out.println (mode (jr));
		
		System.out.println (median (ab));
		
		System.out.println (median (sb));
	}
}

