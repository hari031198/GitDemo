package oopwithtestng;

public class P3 extends P4{

	int a;
	
	
	public P3(int a) {
		super(a);
		this.a=a;
	}

	public int increment()
	{
		a=a+1;
		return a;
	}
	
	public int decrement()
	{
		a=a-1;
		return a;
	}
}

