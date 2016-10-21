package com.svse.proxy;

/**
 * 代理模式
 * @author tgkj
 *
 */
public class Test {
	
	public static void main(String[] args) {
		WangPo wangPo;
		//把王婆叫出来 
		wangPo = new WangPo();  
		//然后西门庆说，我要和潘金莲Happy,然后王婆就安排了西门庆丢筷子哪出戏： 
		wangPo.makeEyesWithMan();  
		//看到没有表面是王婆在做，其实爽的是潘金莲 
		wangPo.happyWithMan();  
		
		
		JiaShi jiaShi = new JiaShi();
		wangPo = new WangPo(jiaShi);  
		wangPo.makeEyesWithMan();
		wangPo.happyWithMan();
		
		
	}
}
