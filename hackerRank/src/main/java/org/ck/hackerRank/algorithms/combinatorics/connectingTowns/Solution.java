package org.ck.hackerRank.algorithms.combinatorics.connectingTowns;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution
{
	public static void main(String[] args)
	{
		try (Scanner in = new Scanner(System.in))
		{
			Integer cases = in.nextInt();

			for (Integer i = 0; i < cases; ++i)
			{
				Integer towns = in.nextInt();

				BigInteger totalPaths = new BigInteger("1");
				for (Integer j = 0; j < towns - 1; ++j)
				{
					BigInteger paths = in.nextBigInteger();
					
					totalPaths = totalPaths.multiply(paths);
				}
				
				System.out.println(totalPaths.mod(new BigInteger("1234567")));
			}
		}
	}
}