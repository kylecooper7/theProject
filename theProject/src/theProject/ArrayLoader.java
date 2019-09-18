package theProject; 

 

import java.util.Scanner; 

 

public class ArrayLoader 

{ 

static String theData[][][] = new String[10][100][10]; 

static Scanner stringInput = new Scanner(System.in); 

static boolean categories = false; 

static boolean commands = false; 

static boolean synonyms = false; 

static  int categoryCounter = 0; 

static  int commandCounter = 0; 

static  int synonymCounter = 0; 

static int nextSpot = 0;

static boolean theBreak = false;

public static void initializeArray() {
	for (int x = 0; x<theData.length; x++) { 

		 

		for (int y = 0; y < theData[x].length; y++) { 

		 

		for (int z = 0; z < theData[x][y].length; z++) { 

		 

		theData[x][y][z] = "empty";

		 

		} 

		 

		} 

		 

		} 
	
}

public static void InputSynonyms(int categoryIndex, int synonymIndex) 
{
	System.out.println("Input List of synonyms: ");
	
	
	for (int x = 0; x<theData.length; x++) { 
		for (int y = 0; y < theData[x].length; y++) { 
		for (int z = 0; z < theData[x][y].length; z++) { 

		 
if(theData[x][y][z].equals("empty")) {
	nextSpot = z;
	theBreak = true;
	break;
	
	
}
if(theBreak) {
	break;
}
		 

		} 
		if(theBreak) {
			break;
		}

		}
		if(theBreak) {
			break;
		}

		} 
	
	
String[] words = stringInput.nextLine().split(" ");
for(int i = 0; i < words.length; i++) {
theData[categoryIndex][synonymIndex][nextSpot + i] = words[i];
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

 

 

 

 

 

 

 