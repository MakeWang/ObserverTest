package com.svse.notifier;

import java.util.Date;
/**
 * 事件委托
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		
		//创建一个尽职的放哨者
		GoodNotifier goodNotifier = new GoodNotifier();
		
		//创建一个玩游戏的同学，开始玩游戏
		WatchCartoonListener game = new WatchCartoonListener();
		//创建一个玩游戏的同学，开始看电视
		WatchingNBAListener nba = new WatchingNBAListener();
		
		//玩游戏的同学告诉放哨的同学，老师来了告诉一下
		goodNotifier.addListenter(game, "stopPlayingGame", new Date());
		//看电视的同学告诉放哨的同学，老师来了告诉一下
		goodNotifier.addListenter(nba, "stopWatchingTV", new Date());
		
		try {
			//一段时间过后
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//老师出现，放哨的人通知所有要帮忙的同学:老师来了 
		goodNotifier.notifyX();
	}
}
