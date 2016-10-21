package com.svse.notifier;

public class GoodNotifier extends Notifier{
	
	
	@Override
	public void addListenter(Object obj, String mothName, Object... args) {
		System.out.println("有新的同学委托尽职近责的放哨人！");
		EventHandler eventHandler = this.getEventHandle();
		eventHandler.addEvent(obj, mothName, args);
	}

	@Override
	public void notifyX() {
		System.out.println("尽职尽者的放哨人告诉所有需要帮忙的同学：老师来了");
		try {
			this.getEventHandle().notityX();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
