package guava.eventbus;

import com.google.common.eventbus.Subscribe;

public class EventListener { // 订阅者

	// @Subscribe保证有且只有一个输入参数,如果你需要订阅某种类型的消息,只需要在指定的方法上加上@Subscribe注解即可
	@Subscribe
	public void listen(OrderEvent event) {
		System.out.println("receive message: " + event.getMessage());
	}

	/*
	 * 一个subscriber也可以同时订阅多个事件 Guava会通过事件类型来和订阅方法的形参来决定到底调用subscriber的哪个订阅方法
	 */
	@Subscribe
	public void listen(String message) {
		System.out.println("receive message: " + message);
	}
}
