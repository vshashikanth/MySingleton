package com.dmantz.shashikanth;

public class Main {
public static void main(String... args) {
	MySingleton obj_1=MySingleton.getInstance();
	MySingleton obj_2=MySingleton.getInstance();
	if(obj_1==obj_2)
		System.out.println("both are equal");
	else
		System.out.println("both are not equal");
}
}
