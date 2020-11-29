/* 5. Given an array A of size N, print the reverse of it.
Input: First line contains an integer denoting the test cases 'T'. T test cases follow.
Each test case contains two lines of input. First line contains N the size of the array A.
The second line contains the elements of the array.
Output: For each test case, in a new line, print the array in reverse order.
Example:
Input:
1
4
1 2 3 4
Output:
4 3 2 1
*/

package day1;

import java.util.Scanner;

public class q5reverseArray {

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
		for(int j=0;j<n;j++) {
			for(int i=arr[j].length-1;i>-1;i--) {
				System.out.print(arr[j][i]+" ");
			}
		}
	}

}
