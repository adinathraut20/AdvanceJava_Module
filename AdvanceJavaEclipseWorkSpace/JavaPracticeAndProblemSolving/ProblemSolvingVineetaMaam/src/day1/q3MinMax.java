/* 3. Given an array A of size N of integers. Your task is to find the minimum and
maximum elements in the array.
Input: The first line of input contains an integer T denoting the number of test cases.
T test cases follow. Each test case contains 2 lines of input. The first line of each test
case contains the size of array N. The following line contains elements of the array
separated by spaces.
Output:
For each test case, print the minimum and maximum element of the array.
Example: Input:
2
6
3 2 1 56 10000 167
5
1 345 234 21 56789
Output:
1 10000
1 56789  */

package day1;

import java.util.Scanner;

public class q3MinMax {

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
			int max = arr[j][0];
			int min = arr[j][0];
			for(int i=0;i<arr[j].length; i++) {
				if(max<arr[j][i]) {	
					max = arr[j][i];
				}
				if(min>arr[j][i]) {
					min = arr[j][i];
				}
			}
			
			System.out.println(min + "  "+ max);
		}
	}

}
