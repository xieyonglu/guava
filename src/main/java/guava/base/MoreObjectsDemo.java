package guava.base;

import com.google.common.base.MoreObjects;

class Person {
	private String name;
	private Integer age;

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}

public class MoreObjectsDemo {

	public static void main(String[] args) {
		Person person = new Person("aa", 11);
		String str = MoreObjects.toStringHelper("Person").add("age", person.getAge()).toString();
		System.out.println(str);
		// 输出Person{age=11}
	}

}
