package com.hand.chenhao;

/*
 * ��101��200֮�����������
 * 
 */
public class PrimeNumber {
	public static void main(String[] args) {
		boolean flag = false;

		System.out.print("(");
		for (int i = 100; i < 201; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				} else
					flag = true;
			}
			if (flag){			
				if(i!=199){
				System.out.print(i + ",");
				}
				
			}
		}
		System.out.print("199)");
	}
}
