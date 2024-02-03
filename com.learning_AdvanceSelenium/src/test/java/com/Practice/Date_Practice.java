package com.Practice;

import java.util.Date;

public class Date_Practice {

	public static void main(String[] args) {
		String time = new Date().toString().replace(" ","_").replace(":","_");
		
		System.out.println(time);

	}

}
