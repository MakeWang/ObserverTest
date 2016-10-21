package com.svse.notifier;

import java.util.Date;
/**
 * �¼�ί��
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		
		//����һ����ְ�ķ�����
		GoodNotifier goodNotifier = new GoodNotifier();
		
		//����һ������Ϸ��ͬѧ����ʼ����Ϸ
		WatchCartoonListener game = new WatchCartoonListener();
		//����һ������Ϸ��ͬѧ����ʼ������
		WatchingNBAListener nba = new WatchingNBAListener();
		
		//����Ϸ��ͬѧ���߷��ڵ�ͬѧ����ʦ���˸���һ��
		goodNotifier.addListenter(game, "stopPlayingGame", new Date());
		//�����ӵ�ͬѧ���߷��ڵ�ͬѧ����ʦ���˸���һ��
		goodNotifier.addListenter(nba, "stopWatchingTV", new Date());
		
		try {
			//һ��ʱ�����
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//��ʦ���֣����ڵ���֪ͨ����Ҫ��æ��ͬѧ:��ʦ���� 
		goodNotifier.notifyX();
	}
}
