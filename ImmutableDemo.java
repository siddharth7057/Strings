/*create a immutable class.*/

final class Student
{
	private final int id;
	private final String name;
	
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
}

public class ImmutableDemo
{
	public static void main(String x[])
	{
		Student s1 = new Student(101,"abc");
		
		System.out.println("Id : "+s1.getId());
		System.out.println("Name : "+s1.getName());
	}
}