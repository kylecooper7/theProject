
package theProject;
import java.util.Scanner;
public class theDriver
	{
		static Scanner userInput = new Scanner(System.in);
		static String theData[][][];
		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				ArrayLoader.initializeArray();
				ArrayLoader.InputSynonyms(1, 0);
				ArrayLoader.returnArray();
			}

	}
