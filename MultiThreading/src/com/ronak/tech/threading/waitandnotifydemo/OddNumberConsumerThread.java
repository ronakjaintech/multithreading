package com.ronak.tech.threading.waitandnotifydemo;

public class OddNumberConsumerThread implements Runnable {
	Producer producer;

	public OddNumberConsumerThread(Producer producer) {
		this.producer = producer;
	}

	@Override
	public void run() {
		int i = 0;
		while (i <= 50) {
			this.producer.PrintOddNumber();
			i++;
		}

	}

}
