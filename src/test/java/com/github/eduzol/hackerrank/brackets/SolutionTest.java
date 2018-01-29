package com.github.eduzol.hackerrank.brackets;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		
		String test  = "{{[[(())]]}}";
		boolean isBalanced = Solution.isBalanced(test);
		Assert.assertTrue(isBalanced);
	}
}
