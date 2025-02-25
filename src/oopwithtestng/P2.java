package oopwithtestng;

import org.testng.annotations.Test;

public class P2 extends P1{
	
	@Test
	public void testRun()
	{
		P3 net=new P3(3);
		int a=3;
		dothis();
		System.out.println(net.increment());
		System.out.println(net.decrement());
		
		System.out.println(net.Multhree());
		System.out.println(net.Multwo());
	}

}
