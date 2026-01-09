/*Q6. Write a program to reverse a given string.
 Input : Java
 Output : avaJ
*/

import java.util.Scanner;
public class Q6ReverseString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string.");
		String s = sc.nextLine();
		
		char ch[] = s.toCharArray();
		int start = 0;
		int end = ch.length-1;
		
		while(start<end)
		{
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
		
			start++;
			end--;
		}
		String s1 = new String(ch);
		System.out.println("Reverse String : "+s1); 
	}
}