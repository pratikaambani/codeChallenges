package org.ck.codeEval.medium.guessTheNumber;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		File file = new File(args[0]);
		try (BufferedReader buffer = new BufferedReader(new FileReader(file)))
		{
			String line;
			while ((line = buffer.readLine()) != null)
			{
				line = line.trim();
				String[] arguments = line.split(" ");
				
				int lowerBoundary = 0;
				int upperBoundary = Integer.parseInt(arguments[0]);
				
				for (int i = 1; i < arguments.length; ++i)
				{
					int numberOfNumbers = upperBoundary - lowerBoundary;
					int guess = -1;
					
					if (numberOfNumbers % 2 == 0)
					{
						guess = (numberOfNumbers / 2) + lowerBoundary;
					}
					else
					{
						guess = (numberOfNumbers / 2) + lowerBoundary + 1;
					}
					
					if (arguments[i].equals("Lower"))
					{
						upperBoundary = guess - 1;
					}
					else if (arguments[i].equals("Higher"))
					{
						lowerBoundary = guess + 1;
					}
					else if (arguments[i].equals("Yay!"))
					{
						System.out.println(guess);
					}
				}
			}
		}
	}
}