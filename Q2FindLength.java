/*Q2. Write a program to find the length of a string.
 Input : Programming
 Output : 11
*/

import java.util.Scanner;
public class Q2FindLength
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string.");
		String s = sc.nextLine();
		
		char ch[] = s.toCharArray();
		int count = 0;
	
		for(int i=0;i<ch.length;i++)
		{
			count++;
		}
		System.out.println("Count : "+count);
	}
}