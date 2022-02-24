package com.aaludra.loops;

import java.util.Scanner;

public class Basic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
	int div =2;
	
	while(div>no) 
	{
		if(div%no==0) {
			System.out.println("Not a prime");
			div++;
		}
		if(no==div) {
			System.out.println("prime");
		}
			
		}}}
