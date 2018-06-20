package com.dmantz.shashikanth;

public class MySingleton {
private static MySingleton mysingleton_obj=new MySingleton();
private MySingleton() {
	
}
public static MySingleton getInstance() {
	if(mysingleton_obj==null)
		return new MySingleton();
	else
		return mysingleton_obj;
		
}
}
