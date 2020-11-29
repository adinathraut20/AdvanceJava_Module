/* 3. Given a set of N nuts of different sizes and N bolts of different sizes. There
is a one-one mapping between nuts and bolts. Match nuts and bolts
efficiently.
Comparison of a nut to another nut or a bolt to another bolt is not
allowed. It means nut can only be compared with bolt and bolt can only
be compared with nut to see which one is bigger/smaller.
The elements should follow the following order ! # $ % & * @ ^ ~ .
Example 1:
Input:
N = 5
nuts[] = {@, %, $, #, ^}  //   @%$#^
bolts[] = {%, @, #, $ ^} //    %@#$^ 
Output:
# $ % @ ^
# $ % @ ^
Example 2:
Input:
N = 9 
nuts[] = {^, &, %, @, #, *, $, ~, !}  //  ^&%@#*$~!
bolts[] = {~, #, @, %, &, *, $ ,^, !} //  ~#@%&*$^!
Output:
! # $ % & * @ ^ ~
! # $ % & * @ ^ ~
Your Task:
You don't need to read input or print anything. Your task is to complete
the function matchPairs() which takes an array of characters nuts[],
bolts[] and n as parameters and returns void. You need to change the
array itself
*/

package day1Diff;

import java.util.Scanner;

public class q3Array {

	static void matchpairs(int n, char[] nuts, char []bolt) {
		String str = "!#$%&*@^~";
		char [] arr = str.toCharArray();
		int count = 0;
		for(int i=0;i<n;i++) {
			for(int j=count;j<n;j++) {
				if(nuts[j] == arr[i]) {
					
					char temp = nuts[count];
					nuts[count] = nuts[j];
					nuts[j] = temp;
					count++;
				}
			}
		}
		count = 0;
		for(int i=0;i<n;i++) {
			for(int j=count;j<n;j++) {
				if(nuts[i] == bolt[j]) {
					
					char temp = bolt[count];
					bolt[count] = bolt[j];
					bolt[j] = temp;
					count++;
				}
			}
		}
		for(char i : nuts) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
		for(char i : bolt) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char []nut = null;
		char []bolt = null;
		
		String n1 = sc.next();
		nut = n1.toCharArray();
	
		
		String n2 = sc.next();
			bolt = n2.toCharArray();
		
		
		matchpairs(n,nut,bolt);
	}
}
