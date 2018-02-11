package guava.base;

import com.google.common.base.Preconditions;

/**
 * 前置条件Preconditions提供静态方法来检查方法或构造函数，被调用是否给定适当的参数。
 * 它检查的先决条件。其方法失败抛出IllegalArgumentException。
 * 
 * @author yonglu.xie
 *
 */
public class PreconditionsDemo {
	public static void main(String[] args) {
		try {
			getValue(5);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		try {
			sum(4, null);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

		try {
			sqrt(-1);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}

	private static double sqrt(double input) {
		Preconditions.checkArgument(input > 0.0, "Illegal Argument passed: Negative value %s.", input);
		return Math.sqrt(input);
	}

	private static int sum(Integer a, Integer b) {
		a = Preconditions.checkNotNull(a, "Illegal Argument passed: First parameter is Null.");
		b = Preconditions.checkNotNull(b, "Illegal Argument passed: First parameter is Null.");
		return a + b;
	}

	private static int getValue(int input) {
		int[] data = { 1, 2, 3, 4, 5 };
		int index = Preconditions.checkElementIndex(input, data.length, "Illegal Argument passed: Invalid index.");
		return data[index];
	}
}