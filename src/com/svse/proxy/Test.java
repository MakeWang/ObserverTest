package com.svse.proxy;

/**
 * ����ģʽ
 * @author tgkj
 *
 */
public class Test {
	
	public static void main(String[] args) {
		WangPo wangPo;
		//�����Žг��� 
		wangPo = new WangPo();  
		//Ȼ��������˵����Ҫ���˽���Happy,Ȼ�����žͰ����������춪�����ĳ�Ϸ�� 
		wangPo.makeEyesWithMan();  
		//����û�б�����������������ʵˬ�����˽��� 
		wangPo.happyWithMan();  
		
		
		JiaShi jiaShi = new JiaShi();
		wangPo = new WangPo(jiaShi);  
		wangPo.makeEyesWithMan();
		wangPo.happyWithMan();
		
		
	}
}
