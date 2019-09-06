package guava.collect;

import java.util.Map;

import com.google.common.base.Function;
import com.google.common.collect.Maps;

public class MapsDemo {

	public static void main(String[] args) {
		transformValues();
		
	}
	
	private static Map<String, User> newMap() {
		Map<String, User> newMap = Maps.newHashMap();
		newMap.put("A", new User("张三", 20));
		newMap.put("B", new User("李四", 21));
		newMap.put("C", new User("王五", 22));
		
		return newMap;
	}
	
	private static void transformValues() {
		Map<String, User> map = newMap();
		
		Map<String, String> newMap = Maps.transformValues(map, new Function<User, String>() {
            @Override
            public String apply(final User input) {
                return input.getName();
            }

        });
		
		System.out.println(newMap);
	}

}
