/*Q4. Write a program to count the number of vowels in a string.
 Input : Education
 Output : 5
*/

import java.util.Scanner;
public class Q4CountVowels
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string.");
		String s = sc.nextLine();

		char ch[] = s.toCharArray();

		int vowelCount = 0;
		int count = 0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='A' || ch[i]=='e' || ch[i]=='E' || ch[i]=='i' || ch[i]=='I' || ch[i]=='o' || ch[i] =='O' || ch[i]=='u' || ch[i]=='U')
			{
				count++;
			}
		}
		System.out.println("Number of vowels : "+count);
	}
}