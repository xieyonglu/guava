package guava;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

public class CallbackCacheDemo {
	public static void main(String[] args) {
		Cache<String, String> cache = CacheBuilder
				.newBuilder()
				.maximumSize(100)
				.expireAfterAccess(1, TimeUnit.SECONDS)
				.build();
		try {
			String result = cache.get("java", () -> "hello java");
			System.out.println(result);
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
