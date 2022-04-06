package StatsPackage;


import java.io.*;

public class Stats 
{
	
	public static void main (String[] args) 
	{
		
		File dataFile = new File("test1.txt");
		FileReader in;
		BufferedReader readFile;
		String name;
		double avgScore;
		double totalScores = 0;
		String grade;
		double score = 0;
		int numScores = 0;
		String g1;
		double g12;
		String [] input = new String[8];
		String fnam;
		String lnam;
		
		
		
		try 
		{
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			
			while((name = readFile.readLine()) != null) 
			{
				
				g1 = input[1];
				g12 = g1.Double.parseDouble(g1);
				System.out.println(g1);
				
				
			}
			avgScore = totalScores / numScores; 
			System.out.println("Average Score =   "+ avgScore);
			readFile.close();
			in.close();
		} 
		
		
		
		catch(FileNotFoundException e) 
		{
			System.out.println("File does not exist or could not be found");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}
		
		catch(IOException e)
		
		{
			System.out.println("Problem Reading File");
			System.err.println("IO Exception: " + e.getMessage());
		}
	}

}
