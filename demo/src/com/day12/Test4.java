package com.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));		
		
		System.out.print("수식[3+5]");//13 +2 34
		String str = br.readLine();
		
		str = str.replaceAll("\\s", "");//공백제거(13+234)
		
		//String[] op = {"+","-","*","/"};
		//for(String oper : op)
		
		for(String oper : new String[]{"+","-","*","/"}) {
			//str = 13+234
			//index:012345
			int pos = str.indexOf(oper);
			
			if(pos>-1) {
				
				int num1 = 
				Integer.parseInt(str.substring(0, pos));//13
				int num2 = 
				Integer.parseInt(str.substring(pos+1));//234
				
				int result = 0;
				char op = str.charAt(pos);//+
				
				switch(op) {
				case '+': result=num1+num2;break;
				case '-': result=num1-num2;break;
				case '*': result=num1*num2;break;
				case '/': result=num1/num2;break;
				}
				
				//System.out.printf("%d %c %d = %d",
				//		num1,op,num2,result);
				
				String s = String.format("%d %c %d = %d",
							num1,op,num2,result);
				
				System.out.println(s);				
				
			}
		}

	}

}





