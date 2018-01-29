package com.github.eduzol.hackerrank.ransom;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		
		String[] magazine = new String[]{"give","me","one","grand","today", "night"};
		String[] note = new String[] {"give","one","grand","today"};

		boolean canReplicate =	Solution.canReplicateWords(magazine, note);
		Assert.assertTrue(canReplicate);
		
		
		
	}
}
