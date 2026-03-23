package Demo;

import java.util.UUID;

public class UUid {

	public static void main(String[] args) {

		Demo d=new Demo();
		System.out.println(d.getvalue().hashCode());
	}
}
class Demo
{
	public UUID getvalue()
	{
		return UUID.randomUUID();
	}
}
