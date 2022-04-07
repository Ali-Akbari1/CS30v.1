package MyRoster;

import java.io.*;
import java.util.Scanner;

public class Roster 
{
	
	public static void main(String[] args) 
	{

		
		Scanner input = new Scanner(System.in);
		String fileName;
		int num;
		String name;
		FileReader in;
		BufferedReader readFile;
		FileWriter out;
		BufferedWriter writeFile;
		
		
		System.out.println("Enter the Name of your File: ");
		fileName = input.next();
		fileName = fileName + ".txt";
		File dataFile = new File(fileName);
		
		
		System.out.println("What is the Number of Students in Your Class: ");
		num = input.nextInt();
		
		
		try 
		{
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			for (int i = 0; i < num; i++) 
			{
				  System.out.print("Enter Student Name: ");
				  name = input.next();
				  writeFile.write(name);
				  writeFile.newLine();
			}
			
			writeFile.close();
			out.close();
			System.out.println("Data Has Been Written To File");
		}
		
		catch(IOException e)
		
		{
			System.out.println("Problem Reading File");
			System.err.println("IO Exception: " + e.getMessage());
		}
		
		
	}

}
