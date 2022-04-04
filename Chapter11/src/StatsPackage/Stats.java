package StatsPackage;


import java.io.*;

public class Stats 
{
	
	public static void main (String[] args) 
	{
		
		File dataFile = new File("test1.dat");
		FileReader in;
		BufferedReader readFile;
		String score;
		double avgScore;
		double totalScores = 0;
		int numScores = 0;
		
		try 
		{
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			while((score = readFile.readLine()) != null) 
			{
				numScores +=1;
				System.out.println(score);
				totalScores += Double.parseDouble(score);
				
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
