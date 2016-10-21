package com.svse.observer;
/**
 * 观察者设计模式demo
 * @param args
 */
public class Test {
	
	public static void main(String[] args) {
		/**
		 *  情景实例
		 *	班主任来啦！
		 *	小A对小B说：“今天真是笑死人了，我们班一位同学在仔细的时候看NBA球赛，被班主任抓了个正着。班主任脸都绿了，哈哈，真是笑死我了。
	     *	小B说：”啊，你们怎么同学怎么敢在课上看电视啊？“
		 *	小A说：”没有的，他们那帮子男生经常自习的时候看球赛的。我们班有个女生坐在前排，那些男生就给她送写小礼物啊什么的。班主任来了，那个女生就去通知敲一下桌子。“
		 *	小B说：”好吧。这也行。那今天怎么会有人被抓？“
		 *	小A说：”这是因为刚好班主任来的时候，那个女生去上厕所了。结果一个看漫画的男生没被抓，那个看NBA球赛的男生被抓了。手机都被没收了呢！”
		 *	小B说：“好吧。你说的这个场景，让我想起了一个设计模式，叫做观察者模式。要不给你讲讲？”
		 *	小A吐血，倒地不起。。。。。。
		 */
		
		ConcreteSubject concreteSubject = new ConcreteSubject();
		CartoonObserver concreteObserver = new CartoonObserver();
		NBAObserver nbaObserver = new NBAObserver();
		concreteSubject.addObserver((IObserver) concreteObserver);
		concreteSubject.addObserver(nbaObserver);
		//concreteSubject.removeObserver(nbaObserver);
		concreteSubject.notifyAllObserver("老师来了");
		
	}
}
