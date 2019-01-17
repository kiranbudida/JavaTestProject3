package com.example;

import java.util.Date;

public class MyTestClass3 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Date d=new Date();
		System.out.println("From MyTestClass3: Hello Java World: "+d.toLocaleString());
	}
}
