package org.ck.hackerRank.algorithms.combinatorics.connectingTowns;

import static org.junit.Assert.assertEquals;

import org.ck.hackerRank.test.BaseTest;
import org.junit.Test;

public class SolutionTest extends BaseTest
{
	@Test
	public void test00() throws Exception
	{
		pipeResource("00");
		
		Solution.main(null);
		
		assertEquals(getResult("3", "8"), this.output.toString());
	}
}
