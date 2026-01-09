/*Q1. Write a Java program to print a given string.
 Input : Hello Java
 Output : Hello Java
*/

import java.util.Scanner;
public class Q1PrintGivenString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string.");
		//String s = sc.next();
		String s = sc.nextLine();
		System.out.println(s);
	}
}