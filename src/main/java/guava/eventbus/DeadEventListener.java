package guava.eventbus;

import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.Subscribe;

public class DeadEventListener {
	boolean isDelivered = true;

	@Subscribe
	public void listen(DeadEvent event) {
		isDelivered = false;
		System.out.println(event.getSource().getClass() + "  " + event.getEvent()); // source通常是EventBus
	}

	public boolean isDelivered() {
		return isDelivered;
	}
}
