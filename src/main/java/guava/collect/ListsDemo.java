package guava.collect;

import java.util.List;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

public class ListsDemo {

	public static void main(String[] args) {
		partition();
		
		transform();
	}

	private static List<User> newList() {
		List<User> lists = Lists.newArrayList();
		lists.add(new User("张三", 20));
		lists.add(new User("李四", 21));
		lists.add(new User("王五", 22));
		
		return lists;
	}
	
	private static void partition() {
		List<User> lists = newList();

		List<List<User>> newList = Lists.partition(lists, 2);

		for (List<User> users : newList) {
			System.out.println("partition ==> " + users);
		}
	}
	
	private static void transform() {
		List<User> lists = newList();
		
		List<String> newList = Lists.transform(lists, new Function<User, String>() {
            @Override
            public String apply(final User input) {
            	input.setName(input.getName() + "_change");
            	input.setAge(input.getAge() + 100);
                return input.toString();
            }
        });
		
		System.out.println("transform ==> " + newList);
	}

}
