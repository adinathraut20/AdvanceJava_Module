/* 4. Given an integer array A of size N, find the sum of elements in it.
Input: First line contains an integer denoting the test cases 'T'. T test cases follow.
Each test case contains two lines of input. First line contains N the size of the array A.
The second line contains the elements of the array.
Output: For each test case, print the sum of all elements of the array in separate lines.
 Example:Input:
2
3
3 2 1
4
1 2 3 4
Output:
6
10
*/

package day1;

import java.util.Scanner;

public class q4SumofElements {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int arr[][] = new int[n][];
			for(int i=0;i<n;i++) {
				int n1 = sc.nextInt();
				arr[i] = new int[n1];
				for(int j=0;j<n1;j++) {
					arr[i][j] = sc.nextInt();
				}
				
			}
			for(int[] i : arr) {
				int sum=0;
				for(int j : i) {
					sum+=j;
				}
				System.out.println(sum);
			}
			
	}

}
