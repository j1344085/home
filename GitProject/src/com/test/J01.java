package com.test;

import java.util.Scanner;
import java.io.*;

public class J01 {

	//int num[] = new int [10];
	//int Kor_num[] = {1,2,3,4,5,6,7,8,9,10}; //{'첫','두','세','네','다섯','여섯','일곱','여덟','아홉','열'};
	
	public static void main(String[] args) throws IOException{
		int num[] = new int [10];
		int Kor_num[] = {1,2,3,4,5,6,7,8,9,10};
		int max; // = -2147483648;
		int min; // =  2147483647;
		
		// TODO Auto-generated method stub  // 주석 Ctrl+/
		Scanner s = new Scanner(System.in); // Ctrl+shi1ft+o
		//this.Kor_num = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<10; i++)
		{
			System.out.print( Kor_num[i] + "번째 숫자를 입력하세요 : ");
			num[i] = s.nextInt();
		}
		max = num[0];
		min = num[0];
		for(int i=1; i<10; i++)
		{
			if(num[i] > max) max = num[i];
			else if(num[i] < min) min = num[i];
		}
		System.out.println("가장큰 수는 : " + max + "가장 작은 수는 " + min);
		
		//System.out.println("Hello");
		//System.out.println("Fix J01");
	}

}
