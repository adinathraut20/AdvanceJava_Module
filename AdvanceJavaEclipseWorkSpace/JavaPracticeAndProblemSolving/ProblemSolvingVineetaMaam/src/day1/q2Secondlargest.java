/* 2. Given an array Arr of size N, print the second largest element from an array.
Example 1:
Input:
N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34
 Explanation: The largest element of the
array is 35 and the second largest element
is 34.
*/

package day1;

import java.util.Scanner;

public class q2Secondlargest {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0;i<arr.length; i++) {
			if(max<arr[i]) {	
				max = arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		int max2 = min;
		for(int i: arr) {
			if(max2 < max && max2 < i && max > i) {
				max2 = i;
			}
		}
		System.out.println(max2);
		
	/*	max = arr[0];
		max2 = arr[0];
		for(int i=0;i<arr.length; i++) {
			if(max <= arr[i]) {
				max = arr[i];
				
			}else if(max2 < max && max2 < arr[i] && max > arr[i] ) {
					max2 = arr[i];
				
			}
			//System.out.println("max : "+max+" max2 : "+max2);
			
		}
		System.out.println(max2);*/
	}

}
