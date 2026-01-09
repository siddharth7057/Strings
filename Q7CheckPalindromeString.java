/*Q7. Write a program to check whether a string is palindrome or not.
 Input : madam
 Output : Palindrome
*/

import java.util.Scanner;
public class Q7CheckPalindromeString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string.");
		String s = sc.nextLine();
		
		char ch[] = s.toCharArray();
		boolean isPalindrome = true;
		
		int start = 0;
		int end = ch.length-1;
	
		while(start<end)
		{
			if(ch[start]!=ch[end])
			{
				isPalindrome = false;
			}
			start++;
			end--;
		}
		if(isPalindrome)
		{
			System.out.println("Palindrome String.");
		}
		else
		{
			System.out.println("Not A Palindrome String.");
		}
		
	}
}