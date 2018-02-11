package guava.base;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Joiner;

/**
 * Joiner 提供了各种方法来处理字符串加入操作，对象等。
 * Joiner的实例不可变的，因此是线程安全的。
 * 
 * @author yonglu.xie
 *
 */
public class JoinerDemo {
	public static void main(String[] args) {
		/*
		 * on:制定拼接符号，如：test1-test2-test3 中的 “-“ 符号 skipNulls()：忽略NULL,返回一个新的Joiner实例
		 * useForNull(“Hello”)：NULL的地方都用字符串”Hello”来代替
		 */
		StringBuilder sb = new StringBuilder();
		Joiner.on(",").skipNulls().appendTo(sb, "Hello", "guava");
		System.out.println(sb);
		System.out.println(Joiner.on(",").useForNull("none").join(1, null, 3));
		System.out.println(Joiner.on(",").skipNulls().join(Arrays.asList(1, 2, 3, 4, null, 6)));
		Map<String, String> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		System.out.println(Joiner.on(",").withKeyValueSeparator("=").join(map));
	}
}