package com.svse.notifier;

public class GoodNotifier extends Notifier{
	
	
	@Override
	public void addListenter(Object obj, String mothName, Object... args) {
		System.out.println("���µ�ͬѧί�о�ְ����ķ����ˣ�");
		EventHandler eventHandler = this.getEventHandle();
		eventHandler.addEvent(obj, mothName, args);
	}

	@Override
	public void notifyX() {
		System.out.println("��ְ���ߵķ����˸���������Ҫ��æ��ͬѧ����ʦ����");
		try {
			this.getEventHandle().notityX();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
