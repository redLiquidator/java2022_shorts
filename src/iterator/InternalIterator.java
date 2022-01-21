package iterator;

import java.util.Arrays;
import java.util.List;

//Java8 introduces internal iterators
public class InternalIterator {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(11,22,33,44,55,66,77,88,99,100);

		//internal iterator
		//numbers.forEach(number ->System.out.println(number+" "));
		numbers.forEach(System.out::println);
	}
}
