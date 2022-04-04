import java.io.*;
import java.util.Scanner;

public class MyFile2
{
	public static void main(String[] args) 
	{
		String action;
		File textFile = new File("zzz.txt");
		if (textFile.exists()) 
		{
			System.out.println("File Already Exists");
			
		}
		
		else 
		{

			
			do {
				

				textFile.createNewFile();
				System.out.println("New File Created");
				
				Scanner input = new Scanner(System.in);
				System.out.println("Would You like to Keep (K) or Delete the File (D) or Quit (Q)");
				String userInput = input.nextLine();
				action = input.next();


				
				if (action.equalsIgnoreCase("K") || (action.equalsIgnoreCase("Keep"))) 
				{
					System.out.println("File has been kept");
				}
				
				
				if (action.equalsIgnoreCase("D") || (action.equalsIgnoreCase("Delete"))) 
				{
					textFile.delete();
					System.out.println("File has been Deleted");
				}
				
				
			}

			while (action.equalsIgnoreCase("Q") || (action.equalsIgnoreCase("Quit")));
			}

		}
	}