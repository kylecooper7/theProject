package theProject;

import java.util.Scanner;

public class ArrayLoader
	{
		static String theData[][][];{{{}}}
		static Scanner stringInput = new Scanner(System.in);
		static boolean categories = false;
		static boolean commands = false;
		static boolean synonyms = false;
		
		public static void Input()
			{
			
			System.out.println("Input Type?");
			String inputType = stringInput.nextLine();
			String[] words = stringInput.nextLine().split(" ");
			if(inputType.toLowerCase().equals("categories")) {
			categories = true;	
			}
			if(inputType.toLowerCase().equals("commands")) {
				commands = true;	
				}
			if(inputType.toLowerCase().equals("synonyms")) {
				synonyms = true;	
				}

			}
		public static String[][][] returnArray()
			{


for (int x = 0; x<theData.length; x++) {
	
	for (int y = 0; y < theData[x].length; y++) {
		
		for (int z = 0; z < theData[x][y].length; z++) {
			
			System.out.println(theData[x][y][z]);
			
		}
		
	}
	
}
return theData;
			}

	}
