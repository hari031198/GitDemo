package javastreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {
	//Count no of names start with a in the list
		ArrayList<String> names= new ArrayList<String>();
		names.add("Alpha");
		names.add("Ash");
		names.add("ram");
		names.add("Adam");
		names.add("hempra");
		
		Long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println("output"+c);
		//another method ()
		Long A=Stream.of("Hari","Hem","Ram","pan").filter(s->s.startsWith("R")).count();
		System.out.println("out"+A);
		
		//to print all the name of array list with length >4
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		// print the value with limit
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		//print the value ends with a with uppercase
		Stream.of("Hari","Hema","Ram","pan").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		//print the letter starts with upper case and sorted
		// here using arraylist as list
		List<String> at=Arrays.asList("Hzari","Hema","Ram","pan");
		at.stream().filter(s->s.startsWith("H")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		// merging of two streams
		List<String> af=Arrays.asList("Loop","while","for");
		
		Stream<String> newstream=Stream.concat(at.stream(),af.stream());
		boolean tag=newstream.anyMatch(s->s.equalsIgnoreCase("Loop"));
		System.out.println(tag);
		//collector concepts - its convert the stream output into list
		List<String> ASD=Stream.of("Hzari","Hema","Ram","pan").filter(s->s.startsWith("H")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ASD);
		System.out.println(ASD.get(1));
		//integer value sorted and unique number
		List<Integer> number=Arrays.asList(3,3,2,4,5,7,6,4,1,2,9);
		number.stream().distinct().sorted().forEach(s->System.out.println(s));
		//for the same integer convert into list 
		List<Integer> number1=Arrays.asList(3,3,2,4,5,7,6,4,1,2,9)
				.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(number1);
		System.out.println(number.get(3));

	}

}
