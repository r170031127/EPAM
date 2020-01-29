package epam;

public class parent {
	public static void main(String []args)
	{
	int same;
	child c=new child();
	same=c.same;
	System.out.println(same);
	}
}
	 class child{
	int same=989;
	}
