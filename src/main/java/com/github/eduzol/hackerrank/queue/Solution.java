package com.github.eduzol.hackerrank.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
	
	public static class MyQueue <T> {
		
		private Deque<T> inbox = new LinkedList<T>();
		private Deque<T> outbox =  new LinkedList<T>();
		
		public void enqueue(T e) {
			
			inbox.push(e);
			
		}
		
		public T dequeue () {

			if ( outbox.isEmpty() ) {
				while(!inbox.isEmpty()) {
					outbox.push(inbox.pop());
				} 
			}
			return outbox.pop();
		}
		
		public T peek() {
			if ( outbox.isEmpty() ) {
				while(!inbox.isEmpty()) {
					outbox.push(inbox.pop());
				} 
			}
			return outbox.peek();
		}
		
	}
	
    public static void main(String[] args) {
        
    	MyQueue<Integer> queue =new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}