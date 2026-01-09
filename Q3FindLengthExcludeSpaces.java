/* Output : 11
Q3. Write a program to count total characters in a string (excluding spaces).
 Input : Java Language
 Output : 12
*/


import java.util.Scanner;
public class Q3FindLengthExcludeSpaces
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string.");
		String s = sc.nextLine();
	
		char[] ch = s.toCharArray();
		int count = 0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				continue;
			}
			count++;
		}
		System.out.println("Count(excluding spaces) : "+count);
	}
}