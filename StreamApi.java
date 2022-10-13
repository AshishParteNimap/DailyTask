package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamApi {
			//creating string
	
			//creating Stream using Collection
	
	//Function covert a List into Stream
	private static <T> void getStream(List<T> list) {
		java.util.stream.Stream<T> strm=list.stream();
		Iterator<T> itrt=strm.iterator();
		while(itrt.hasNext()) {
			System.out.println(itrt.next()+" ");
		}
	}
	
	//creating Stream from specific value
	private static void getStreamByValue() {
		Stream<Integer> number=Stream.of(18,22,14,17);
		number.forEach(n->System.out.println(n+" "));
	}
	
	//creating Stream from Array
	//using Array.stream()
	private static <T> void getStreamOfArray(T[] arr1){
		
		Stream<T> streamArray=Arrays.stream(arr1);
		Iterator<T> itrteArr=streamArray.iterator();
		while(itrteArr.hasNext()) {
			System.out.println(itrteArr.next()+" ");
		}
	}
	
	//creating Stream using Stream.of()
	
	private static <T> void getStreamBYof(T[] arr) {
		Stream<T> ofStream=Stream.of(arr);
		Iterator<T> ofItrt=ofStream.iterator();
		while(ofItrt.hasNext()) {
			System.out.println(ofItrt.next()+" ");
		}
	}
	
	//creating empty Stream using Stream.empty()
	private static void getEmptyStream() {
		Stream<Character> emptyStr=Stream.empty();
		Iterator<Character> emptyItr=emptyStr.iterator();
		while(emptyItr.hasNext()) {
			System.out.println(emptyItr.next()+" ");
		}
	}
	
	//creating Stream using Stream.builder()
	private static <T> void getBuildedStream() {
		Stream.Builder<String> builder=Stream.builder();
		
		Stream<String> buildStr=builder.add("english").add("math").add("engineering").build();
		Iterator<String> buildItr=buildStr.iterator();
		while(buildItr.hasNext()) {
			System.out.println(buildItr.next()+" ");
		}
	}
	
		//creating infinite Stream using Stream.iterate()
		private static <T> void getInfinteStream(int value,int limit) {
			
		Stream.iterate(value,(Integer n)->n*n).limit(limit).forEach(System.out::println);			
				
	}
		//Creating an infinite Stream using Stream.generate() method
		private static <T> void getGeneratedStream(int gnrtLimit) {
			Stream.generate(Math::random).limit(gnrtLimit).forEach(System.out::println);
			}
		//Create stream from a Pattern using Predicate
		private static  void getPredicateStream(List<String> list,Pattern p) {
			list.stream().filter(p.asPredicate()).forEach(System.out::println);
		}
	
		//creating Stream form iterator
		private static <T> void getIteratorStream(Iterator<T> itrt) {
			Spliterator<T> spltr=Spliterators.spliteratorUnknownSize(itrt, Spliterator.NONNULL);
			Stream<T> strm=StreamSupport.stream(spltr, false);
			Iterator<T> itr=strm.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next()+" ");
			}
		}
		
		//creating Stream form iterable
				private static <T> void getIterableStrem(Iterable<T> itrbl) {
					Stream<T> strmI=StreamSupport.stream(itrbl.spliterator(), false);
					Iterator<T> itrtI=strmI.iterator();
					while(itrtI.hasNext()) {
						System.out.println(itrtI.next()+" ");
					}
							}
	
	public static void main(String[] args) {
		
		//Stream using collection
		List<String> names=new ArrayList<>();
		names.add("ashish");
		names.add("sandesh");
		names.add("papu");
		getStream(names);
		
		//stream from specific value
		getStreamByValue();
		
		
		//Arrays.stream
		String[] arr=new String[] {"india","usa","africa"};
		getStreamOfArray(arr);
		
		//Stream.of
		Integer[] arr1=new Integer[] {12,35,21,46};
		getStreamBYof(arr1);
		
		//EmptyStream
		getEmptyStream();
		
		//Stream builder
		getBuildedStream();
		
		//infinteStream
		int value=12;
		int limit=10;
		getInfinteStream(value, limit);
		
		//Generate infinite Stream using stream.generate
		int gnrtLimit=10;
		getGeneratedStream(gnrtLimit);
		
		//creating Stream form pattern using predicate
		List<String> list=Arrays.asList("ashish","akash","amar","sandesh","sanket","tejas","hriday");
		Pattern p=Pattern.compile("^h");
		getPredicateStream(list, p);
		
		//Stream using iterator
		Iterator<Character> itrC=Arrays.asList('a','e','w','q','y','u').iterator();
		getIteratorStream(itrC);
		
		//Stream usning iterable
		Iterable<Integer> itrbl=Arrays.asList(12,23,34,45,56,67,78);
		getIterableStrem(itrbl);
		
	}
	
}
       



