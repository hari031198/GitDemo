package javastreams;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Count no of names start with a in the list
		
		ArrayList<String> names= new ArrayList<String>();
		names.add("Alpha");
		names.add("Ash");
		names.add("ram");
		names.add("Adam");
		names.add("hem");
		int count =0;
		
		for(int i=0;i<names.size();i++)
		{
			String actual =names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

	
	// void Streamfilter()
	//{
		//	ArrayList<String> names= new ArrayList<String>();
		//	names.add("Alpha");
			//names.add("Ash");
			//names.add("ram");
			//names.add("Adam");
			//names.add("hem");
			
			//Long c=names.stream().filter(s->s.startsWith("A")).count();
			//System.out.println(c);
		
	//}
}


