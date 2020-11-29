/* 1. Given an sorted array A of size N. Find the number of elements which are less than or
equal to given element X.
Input:
The first line of input contains an integer T denoting the number of test cases. Then T
test cases follow. Each test case contains 3 lines of input. The first line contains an
integer N denoting the size of the array. Then the next line contains N space separated
integers forming the array. The third line contains an element X.
Output:
For each test case, in a new line, print the number of elements which are less than or
equal to the given element.
Example:
Input:
2
6
1 2 4 5 8 10
9
7
1 2 2 2 5 7 9
2
Output:
5
4
*/


package day1;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		System.out.println("enter no");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][];
		int x[] = new int[n];
		for(int i=0;i<n;i++) {
			int n1 = sc.nextInt();
			arr[i] = new int[n1];
			for(int j=0;j<n1;j++) {				
				arr[i][j] = sc.nextInt();
			}
			x[i] = sc.nextInt();
		}
		
		
		for(int i=0;i<n;i++) {
			int count = 0;
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j] <= x[i]) {
					count++;
				}
			}
			System.out.println(count);
		}

	}

}
