package org.ck.hackerRank.algorithms.warmup.maximisingXOR;

import java.util.Scanner;

public class Solution
{
	public static void main(String[] args)
	{
		try (Scanner in = new Scanner(System.in))
		{
			Integer a = in.nextInt();

			Integer b = in.nextInt();

			Integer max = Integer.MIN_VALUE;
			for (Integer i = a; i <= b; ++i)
			{
				for (Integer j = i; j <= b; ++j)
				{
					Integer xor = i ^ j;
					
					max = Math.max(xor, max);
				}
			}
			
			System.out.println(max);
		}
	}
}