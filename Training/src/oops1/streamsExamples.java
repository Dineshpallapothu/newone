package oops1;

import java.util.Arrays;
import java.util.List;

public class streamsExamples {

	public static void main(String[] args) {
//		int a[]= {12,23,4,5,76,12,23};
//		
////		List <List<Integer>>values =Arrays.asList(
////		Arrays.asList(1,2,34,56),
////		Arrays.asList(7,8,95,4,6)
////		);
//		List<Integer> values=new ArrayList<>();
//		
//		for(int f:a) {
//         values.add(f);
//		}
//		List<Integer> h=values.stream().sorted(Comparator.reverseOrder()).toList();
//		System.out.println(h);
////	values.stream().map(n->n*10).forEach(System.out::println);
//	//System.out.println(g);
//		//boolean trail=values.stream().anyMatch(n->n==4);
////		System.out.println(trail);
////		values.stream().map(n->n/10).forEach(System.out::println);
//		
//
//		//int f=values.stream().filter(n->(n>20)).reduce(0,(c,b)->c+b);
//		//values.stream().limit(2).forEach(System.out::println);
//		//values.stream().skip(5).forEach(System.out::println);
//		//values.stream().flatMap(Collection::stream);
////		List<Integer>g=values.stream().flatMap(Collection::stream).collect(Collectors.toList());
////		System.out.println(g);
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

	        // Check if all elements are even
	        boolean allEven = numbers.stream()
	                .allMatch(n -> n % 2 == 0);

	        System.out.println("All even: " + allEven);  // Output: false

	        // Check if any element is even
	        boolean anyEven = numbers.stream()
	                .anyMatch(n -> n % 2 == 0);

	        System.out.println("Any even: " + anyEven);  // Output: true

	        // Check if no element is negative
	        boolean noneNegative = numbers.stream()
	                .noneMatch(n -> n < 0);

	        System.out.println("None negative: " + noneNegative);  // Output: true
		
	}

}
