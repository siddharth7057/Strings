/*Q5. Write a program to count consonants in a string.
 Input: Computer
 Output: 5
*/

import java.util.Scanner;
public class Q5CountConsonants
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
			if(ch[i]!='a' && ch[i]!='A' && ch[i]!='e' && ch[i]!='E' && ch[i]!='i' && ch[i]!='I' && ch[i]!='o' && ch[i] !='O' && ch[i]!='u' && ch[i]!='U')
			{
				count++;
			}

		}
		System.out.println("Number of consonants : "+count);
	}
}