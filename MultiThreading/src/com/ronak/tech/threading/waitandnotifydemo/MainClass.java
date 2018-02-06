package com.ronak.tech.threading.waitandnotifydemo;

public class MainClass {
	public static void main(String[] args) {

		Producer producer = new Producer();
		new Thread(new EvenNumberConsumerThread(producer)).start();
		new Thread(new OddNumberConsumerThread(producer)).start();

	}
}
