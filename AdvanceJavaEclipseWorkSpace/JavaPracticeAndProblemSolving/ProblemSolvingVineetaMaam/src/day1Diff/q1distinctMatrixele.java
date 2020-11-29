/* 1. Given a N x N matrix M. Write a program to find the count of all the
distinct elements common to all rows of the matrix. Print count of such
elements.
Example 1: Input: N = 4
M = {{2, 1, 4, 3},
 {1, 2, 3, 2},
 {3, 6, 2, 3},
 {5, 2, 5, 3}}
Output: 2
Explanation: Only 2 and 3 are common in all rows.
Example 2: Input: N = 5
M = {{12, 1, 14, 3, 16},
 {14, 2, 1, 3, 35},
 {14, 1, 14, 3, 11},
 {14, 5, 3, 2, 1},
 {1, 18, 3, 21, 14}}
Output: 3
Explanation: 14, 3 and 1 are common in all the rows
*/

package day1Diff;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class q1distinctMatrixele {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*int M[][] = new int[][]{{2, 1, 4, 3},
				 {1, 2, 3, 2},
				 {3, 6, 2, 3},
				 {5, 2, 5, 3}};*/
		
		int M[][] = new int[][]{{12, 1, 14, 3, 16},
				 {14, 2, 1, 3, 35},
				 {14, 1, 14, 3, 11},
				 {14, 5, 3, 2, 1},
				 {1, 18, 3, 21, 14}};
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		HashSet<Integer> hSet = new HashSet<Integer> ();
		for(int i=0;i<M.length;i++) {
			
			HashSet<Integer> hSet1 = new HashSet<Integer> ();
			
			for(int j=0;j<M[i].length;j++) {
				if(i==0) {
					hSet.add(M[i][j]);
					hmap.put(M[i][j], 1);
					//System.out.println(M[i][j]);
				}
				if(!hSet1.contains(M[i][j])) {
					hSet1.add(M[i][j]);
				}
			}
			
			if(i!=0) {
					Iterator<Integer> value = hSet1.iterator(); 
				  
		        	while (value.hasNext()) { 
		        		int nt = value.next();
		        	//	System.out.println("value : "+nt);
		            	if(hSet.contains(nt)){
		            		int c = hmap.get(nt);
		            	//	System.out.println(c);
		            		hmap.put(nt, ++c);
		            	}
		        	} 
			}
			
		}
		int count = 0;
		for (Entry<Integer, Integer> entry : hmap.entrySet()){
		//	System.out.println("Get key "+ entry.getKey() + " get Value :"+ entry.getValue());
			if(entry.getValue() == M.length) {
			//	System.out.println("Get key"+ entry.getKey() + " get Value :"+ entry.getValue());
				count++;
			}            
		}
		System.out.println(count);
	}

}
