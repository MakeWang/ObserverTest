package com.svse.observer;
/**
 * �۲������ģʽdemo
 * @param args
 */
public class Test {
	
	public static void main(String[] args) {
		/**
		 *  �龰ʵ��
		 *	������������
		 *	СA��СB˵������������Ц�����ˣ����ǰ�һλͬѧ����ϸ��ʱ��NBA��������������ץ�˸����š��������������ˣ�����������Ц�����ˡ�
	     *	СB˵��������������ôͬѧ��ô���ڿ��Ͽ����Ӱ�����
		 *	СA˵����û�еģ������ǰ�������������ϰ��ʱ�������ġ����ǰ��и�Ů������ǰ�ţ���Щ�����͸�����дС���ﰡʲô�ġ����������ˣ��Ǹ�Ů����ȥ֪ͨ��һ�����ӡ���
		 *	СB˵�����ðɡ���Ҳ�С��ǽ�����ô�����˱�ץ����
		 *	СA˵����������Ϊ�պð���������ʱ���Ǹ�Ů��ȥ�ϲ����ˡ����һ��������������û��ץ���Ǹ���NBA������������ץ�ˡ��ֻ�����û�����أ���
		 *	СB˵�����ðɡ���˵���������������������һ�����ģʽ�������۲���ģʽ��Ҫ�����㽲������
		 *	СA��Ѫ�����ز��𡣡���������
		 */
		
		ConcreteSubject concreteSubject = new ConcreteSubject();
		CartoonObserver concreteObserver = new CartoonObserver();
		NBAObserver nbaObserver = new NBAObserver();
		concreteSubject.addObserver((IObserver) concreteObserver);
		concreteSubject.addObserver(nbaObserver);
		//concreteSubject.removeObserver(nbaObserver);
		concreteSubject.notifyAllObserver("��ʦ����");
		
	}
}
