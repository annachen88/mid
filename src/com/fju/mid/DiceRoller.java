package com.fju.mid;

import java.util.Random;

public class DiceRoller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		for( ; ;){
		Random r = new Random ();
		int n1 = r.nextInt(6)+1;
		if (n1==6)count++;
        int n2 = r.nextInt(6)+1;
        if (n2==6)count++;
		int n3 = r.nextInt(6)+1;
		if (n1==6)count++;
		System.out.println(n1+" "+n2+" "+n3);
		if(n1==n2||n2==n3||n1==n2){
			break;
		}
	}System.out.println("6點出現"+count+"次");

}}
