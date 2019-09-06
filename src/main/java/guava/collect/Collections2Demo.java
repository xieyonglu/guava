package guava.collect;

import java.util.Collection;
import java.util.List;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

public class Collections2Demo {

	public static void main(String[] args) {
		transform();

		filter();
	}
	
	private static List<User> newList() {
		List<User> lists = Lists.newArrayList();
		lists.add(new User("张三", 20));
		lists.add(new User("李四", 21));
		lists.add(new User("王五", 22));
		
		return lists;
	}

	private static void transform() {
		List<User> lists = newList();

		Collection<String> newList = Collections2.transform(lists, new Function<User, String>() {
			@Override
			public String apply(final User input) {
				input.setName(input.getName() + "_change");
				input.setAge(input.getAge() + 100);
				return input.toString();
			}
		});

		System.out.println("transform ==> " + newList);
	}

	private static void filter() {
		List<User> lists = newList();
		
		Collection<User> newList = Collections2.filter(lists, new Predicate<User>() {
			@Override
			public boolean apply(final User input) {
				return input.getName().equals("张三");
			}
		});
		
		System.out.println("filter ==> " + newList);
	}

}
