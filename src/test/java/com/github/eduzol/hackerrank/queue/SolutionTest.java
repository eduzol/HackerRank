package com.github.eduzol.hackerrank.queue;

import org.junit.Test;

import com.github.eduzol.hackerrank.queue.Solution.MyQueue;

import org.junit.Assert;

public class SolutionTest {

	@Test
	public void test() {
		
		MyQueue<Integer> queue = new MyQueue<>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		Assert.assertTrue( queue.peek() == 1 );
		
	}
}
