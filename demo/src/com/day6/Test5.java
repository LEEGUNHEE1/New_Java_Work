package com.day6;

public class Test5 {

	public static void main(String[] args) {

		int i,j,k,n=2,m=5;

		for(i=0;i<=1;i++){
			
			for(j=1;j<=9;j++){
				
				for(k=n;k<=m;k++){
						System.out.print(k+"*"+j+"="+(k*j)+"\t");
				}

			System.out.println(); //4°³ Âï°í ÁÙ¹Ù²Þ
			}
			System.out.println(); //6´ÜºÎÅÍ ÁÙ¹Ù²Þ
			n=6; m=9;
		}
		
	}

}
