package generics;

import java.util.Arrays;

public class GenericCompare {
	public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
		int count = 0;
		for(T e : anArray)
			if(e.compareTo(elem) > 0)
				++count;
		return count;
	}

	public static void main(String[] args) {
		Integer[] arrays = { 0, 1, 2, 3, 4, 5, 6, 7, 8 ,9 };
		System.out.println(countGreaterThan(arrays, 4));
	}
}