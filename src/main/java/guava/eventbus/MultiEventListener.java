package guava.eventbus;

import com.google.common.eventbus.Subscribe;

public class MultiEventListener {

	@Subscribe
	public void listen(OrderEvent event) {
		System.out.println("receive msg: " + event.getMessage());
	}

	@Subscribe
	public void listen(String message) {
		System.out.println("receive msg: " + message);
	}
}
