package com.github.eduzol.hackerrank.ransom;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
	

	public static boolean canReplicateWords( String[] magazine , String[] note) {
		
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for ( String word : magazine ) {
			if ( map.containsKey(word) ) {
				Integer count = map.get(word);
				map.put(word, ++count);
			}else {
				map.put(word, 1);
			}
		}
		
		
		for (String word : note) {
			if (map.containsKey(word)) {
				Integer count = map.get(word);
				count -= 1;
				if ( count < 0 ) {
					//not enough words to build the note
					System.out.println("No");
					return false;
				}
				map.put(word, count);
			}else {
				//word is not found in magazine, therefore note cannot be built
				System.out.println("No");
				return false;
			}
			
		}
		
		System.out.println("Yes");
		return true;
	}
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
	    int m = in.nextInt();
	    int n = in.nextInt();
	    String magazine[] = new String[m];
	    
	    for(int magazine_i=0; magazine_i < m; magazine_i++){
	    	magazine[magazine_i] = in.next();
	    }
	
	    String ransom[] = new String[n];
	    
	    for(int ransom_i=0; ransom_i < n; ransom_i++){
	    	ransom[ransom_i] = in.next();
	    }
	    
    }

}
