public class StringUnderstandingOne
{
	public static void main(String x[])
	{
		String s = "abc";
		String s1 = "abc";
		System.out.println("Hashcode of s : "+System.identityHashCode(s));
		System.out.println("Hashcode of s1 : "+System.identityHashCode(s1));

		String s2 = new String("abc");
		String s3 = new String("abc");

		System.out.println("Hashcode of s2 : "+System.identityHashCode(s2));
		System.out.println("HashCode of s3 : "+System.identityHashCode(s3));
	}
}