package com.day7;

import com.day8.Com;

public class Test6 {

	public static void main(String[] args) {
		
		Com am = new Com();
		
		am.input();
		int area = am.area();
		int length = am.length();
		am.print(area, length);
		
	}

}
