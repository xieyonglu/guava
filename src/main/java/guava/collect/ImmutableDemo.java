package guava.collect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

public class ImmutableDemo {
	public static void main(String[] args) {
		ImmutableSet<String> set = ImmutableSet.of("a", "b", "c", "d");
		ImmutableSet<String> set1 = ImmutableSet.copyOf(set);
		ImmutableSet<String> set2 = ImmutableSet.<String>builder().addAll(set).add("e").build();
		System.out.println(set);
		ImmutableList<String> list = set.asList();
	}
}
