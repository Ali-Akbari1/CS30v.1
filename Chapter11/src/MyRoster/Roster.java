package MyRoster;

import java.io.*;
import java.util.Scanner;

public class Roster 
{
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of your file");
		String userInput = input.nextLine();
		
		File textFile = new File(userInput);
		if (textFile.exists()) 
		{
			Scanner num = new Scanner(System.in);
			System.out.println("What is the Number of Students in Your Class: ");
			String num1 = num.nextLine();
			
			Scanner nam = new Scanner(System.in);
			System.out.println("Please Enter the First Name and the Last Name of each Student");
			String nam1 = nam.nextLine();
			
			 try 
			 {
			      FileWriter myWriter = new FileWriter("output.txt");
			      myWriter.write(nam1);
			      myWriter.close();
			      System.out.println("Successfully wrote to the file.");
			    } 
			 catch (IOException e)
			 {
					System.out.println("Problem Reading File");
					System.err.println("IO Exception: " + e.getMessage());
			    }
			
			
			
		}
		
		else 
		{
			System.out.println("File Does Not Exist");
		}
	}

}
