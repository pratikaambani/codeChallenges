package org.ck.codeEval.easy.fizzBuzz;

import static org.junit.Assert.assertEquals;

import org.ck.codeEval.test.BaseTest;
import org.junit.Test;

public class MainTest extends BaseTest
{
	@Test
	public void test00() throws Exception
	{
		Main.main(getFileAsArgs("00"));

		assertEquals(getResult("1 2 F 4 B F 7 8 F B", "1 F 3 F 5 F B F 9 F 11 F 13 FB 15"), this.output.toString());
	}
}
