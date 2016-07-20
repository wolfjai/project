package tw.wf.cc.Test1;

import org.apache.commons.lang3.StringUtils;

public class DiffDemo {

	
	public String getDiff(String str1, String str2) throws Exception{
		if(StringUtils.isEmpty(str1) || StringUtils.isEmpty(str2)){
			throw new Exception("empty");
		}
		return StringUtils.difference(str1, str2);
	}
	
	/**
	 * 測試方法
	 */
	public int test1(int a , int b){
		return a+b;
	}
	
	/**
	 * 測試方法2
	 */
	public void test2(){
		
	}
}
