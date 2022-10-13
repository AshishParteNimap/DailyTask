package Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
	public static <T> java.util.stream.Stream<T> 
	getSliceOfStream(java.util.stream.Stream<T> strm,int strtIndex,int endIndex){
		return strm.skip(strtIndex).limit(endIndex-strtIndex+1);
	}
	public static void main(String[] args) {
		
		//Stream map() 
		//mapping
		System.out.println("Stream map() function:-");
		List<Integer> mapIn=Arrays.asList(1,2,3,4,5);
		mapIn.stream().map(n->n*n).forEach(System.out::println);
		
		//Stream filter() 
		//filtering
		List<String> filterStrng=Arrays.asList("ashish","sandesh","harshad","suraj","akash");
		filterStrng.stream().filter(str->str.startsWith("a")).forEach(System.out::println);
		
		//slicing 
		//using skip() and limit()
		List<Integer> sliceInt=new ArrayList<>();
		for(int i=1;i<=10;i++)
		sliceInt.add(i);
		Stream<Integer> Slcstrm=sliceInt.stream();
		System.out.println("\nlist :"+sliceInt);
		Stream<Integer> slice=getSliceOfStream(Slcstrm, 4, 8);
		slice.forEach(System.out::println);
		
		//sorting
		//stream sorted() 
		List<String> sortStr=Arrays.asList("z","w","a","s","e");
		System.out.println("\nsorted stream");
		sortStr.stream().sorted().forEach(System.out::println);
		
		//getting unique element
		//Stream distinct()
		List<Integer> dist=List.of(22,18,18,14,17,12,22,18,17,22,14);
		dist.stream().distinct().forEach(System.out::println);
		
		//peeking element
		//stream peek()
		List<Integer> peek1=Arrays.asList(1,2,4,32,5,7,54);
		//no output due to non terminal operation
		//peek.stream().peek(System.out::println);
		
		peek1.stream().peek(System.out::println).count();
		
		//reducing
		//stream reduce()
		List<Integer> arr=Arrays.asList(22,-4,8,18,-14,9);
		int sum=arr.stream().reduce(0,(number1,number2)->number1+number2);
		System.out.println("\nsum is : "+sum);
	
		//Grouping
		//Stream groupBy()
		List<String> items=Arrays.asList("iphone","macbook","airdopes","iphone","iwatch","airdopes","iphone");
		
		Map<String, Long> appleStore=
				items.stream().collect(
						Collectors.groupingBy(
								Function.identity(),Collectors.counting())
						);
				
		System.out.println(appleStore);
		
		//partitioning 
		//stream partitioning()
		Stream<Integer> num=Stream.of(6,4,2,1,5,6,8);
		Map<Boolean, Long> 
        map = num.collect( 
            Collectors.partitioningBy( 
                n -> (n > 3), Collectors.counting())); 
		System.out.println(map);
		
	}

}
