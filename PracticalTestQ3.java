/*
 *	Practical Test #2 IB Computer Science MDV: Arrays, statistics
 */
import java.util.*;
import java.io.*;

public class PracticalTestQ3
{
	// Array size:
	public static int size(double[] array)
	{
		int result = array.length;
		
		return result;
	}
	//------------------------------------------------------------------

	// Minimum:
	public static double min(double[] array)
	{
		double minimum = array [ 0 ];
		
		for (int c = 0; c < array.length; c ++) {
			
			if (array [ c ] < minimum) {
				
				minimum = array [ c ];
				
			}
			
		}
		return minimum;
	}
	//------------------------------------------------------------------

	// Maximum:
	public static double max(double[] array)
	{
		double maximum = array [ 0 ];
		
		for (int x = 0; x < array.length; x++) {
			
			if (array [ x ] > maximum) {
				
				maximum = array [ x ];
				
			}
			
		}
		
		return maximum;
	}
	//------------------------------------------------------------------

	// Range
	public static double range(double[] array)
	{
		double range = max(array) - min(array);
		
		return range;
	}
	//------------------------------------------------------------------

	// Average:
	public static double average(double[] array)
	{
		double average = 0.0; 
		
		double sum = 0;
		
		for (int i = 0; i < array.length; i ++) {
			
			sum = sum + array [ i ];
		} 
		
		
		average = sum / array.length;
		
		
		return average;
	}
	//------------------------------------------------------------------

	// Mode:
	
	public static double checking (double [ ] array, double n) { //occurences of an element. to work with mode. 
		
		double checking = 0;
		
		for (int v = 0; v < array.length; v ++) { 
			
			if (array [v] == n) {
				
				checking = checking + 1;
				
			}
		}
		
		return checking;
	}
	
	public static double mode(double array[])
	{
		double mode = array [ 0 ];
		
		double frequency = 0;
		
		double maxfrequency = 0;
				
		for (int i = 0; i < array.length; i ++) {
			
			frequency = checking (array, array [ i ]); //frequency of term i 
		
			if (frequency > maxfrequency) {
				
				mode = array [ i ];
				
				maxfrequency = frequency; 
			}

		}
		
		return mode;
	}
	//------------------------------------------------------------------

	// For the median to work, the array double[] MUST BE SORTED
	
	public static double median(double[] array)
	{
		Arrays.sort(array); // DO NOT REMOVE THIS LINE, it sorts the array
		
		double median = 0.0;
				
		double nextelement = 0;
		
		double thiselement = 0;
		
		if (array.length % 2 == 0) {
			
			thiselement = array [(array.length/2)];
			
			nextelement = array [(array.length/2)];
			
			median = (thiselement + nextelement)/2;
			
		}
		
		else {
			
			median = array [((array.length)/2)];
			
		}
		return median;
	}

	public static String formatDouble( double array ) //when any other method is called
	{	
		
		return String.format("%.2f", array); //print with 2 decimal places, according to Big Java Late Objects
		
	}
	//------------------------------------------------------------------

	public static void main (String args[]) throws IOException
	{
		
		System.out.println("\n*** Statistical Analysis of Data Sets ***\n");

		double rainfall[]    = load("rainfall.txt");	// load data from files
		double temperature[] = load("temperature.txt"); // into arrays

		System.out.println( "\nSingapore Rainfall Statistics" );
		System.out.println( "Measurements   : " + (size(rainfall)) );
		System.out.println( "Minimum   (0.2): " + formatDouble (min(rainfall)) ); //formatDouble to be called during each system.out.print but it does not work.
		System.out.println( "Maximum (765.9): " + max(rainfall) );
		System.out.println( "Range   (765.7): " + range(rainfall) );
		System.out.println( "Average(178.89): " + average(rainfall) );
		System.out.println( "Mode    (127.2): " + mode(rainfall) );
		System.out.println( "Median  (159.7): " + median(rainfall) );

		System.out.println( "\nSingapore Temperature Statistics" );
		
		System.out.println ( "Measurements : " + size (temperature) );
		System.out.println ("Minimum : " + min(temperature) );
		System.out.println ("Maximum : " + max(temperature) );
		System.out.println ("Range : " + range(temperature) );
		System.out.println ("Average : " + average(temperature) );
		System.out.println ("Mode : " + mode(temperature) );
		System.out.println ("Median : " + median (temperature) );// write the appropriate code to process the temperature array here

		System.out.println();
	}

	//------------------------------------------
	//- DO NOT MODIFY THE CODE BELOW THIS LINE -
	//------------------------------------------

    public static double[] load(String fileName) throws IOException
    {
        //System.out.println("<<< Loading data >>>");
        File file = new File(fileName);
        if (!file.exists())
        {
            System.out.println("ERROR - Data file not found. Download the file again.");
            return null;
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); //read mode
        String temp;
        int count = 0;
		double[] data = new double[countLines(fileName)];
		while ( br.ready() )
		{
            temp = br.readLine();
            data[count] = Double.parseDouble(temp);
            count++;
        }
        br.close();
        System.out.println(fileName + " file loaded.");// optional
        return data;
    }

    public static int countLines(String fileName) throws IOException
    {
        File file = new File(fileName);
        if ( !file.exists() )
        {
            System.out.println("ERROR - Data file not found. Download the file again.");
            return 0;
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); //read mode
        String temp;
        int count = 0;
		while ( br.ready() )
		{
			temp = br.readLine();
            count++;
        }
        br.close();
        return count;
    }


}


