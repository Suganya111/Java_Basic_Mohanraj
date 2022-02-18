package com.aaludra.collections;

public class CollectionTaskRun {

	public static void main(String[] args) {
		CollectionTask mark =new CollectionTask();
		mark.add(65);
		mark.add(70);
		mark.add(80);
		mark.add(45);
		mark.add(30);
		int avg;
		for(int i = 1;i<mark.size();i++);
		int i =1;
		int total = mark.size();
        avg = total / mark.size(); 
        System.out.println("The Average is: " + avg);
		
		}
	}
