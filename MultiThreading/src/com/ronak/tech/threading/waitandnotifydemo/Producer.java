package com.ronak.tech.threading.waitandnotifydemo;

public class Producer {

	int i=0;
	int j=1;
	boolean condition = false;
	synchronized void  printEvenNumber() {
		while(condition){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Even Number"+i);
		i=i+2;
		condition= true;
		notify();
	}
	
	synchronized void PrintOddNumber(){
		while(!condition){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Odd Number"+j);
		j=j+2;
		condition = false;
		notify();
		
	}
}
