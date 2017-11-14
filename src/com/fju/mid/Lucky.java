package com.fju.mid;

import java.util.Random;
import java.util.Scanner;

public class Lucky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		int number =scanner.nextInt();
		System.out.println("Please enter a number:");
Random r = new Random ();
int n1 = r.nextInt(6)+1;

int n2 = r.nextInt(6)+1;
int n3 = r.nextInt(6)+1;
int n4 = r.nextInt(6)+1;
int n5 = r.nextInt(6)+1;
int n6 = r.nextInt(6)+1;
System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6);
if (n1==number){System.out.println("Yes");}
else{if (n2==number){System.out.println("Yes");}else{if (n3==number)System.out.println("Yes");
else{if (n4==number){System.out.println("Yes");}else{if (n5==number)System.out.println("Yes");else{if (n3==number)System.out.println("Yes");
else{System.out.println("No");}}
}
}}}}}
	
