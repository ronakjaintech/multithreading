package com.ronak.tech.threading.waitandnotifydemo;

public class EvenNumberConsumerThread implements Runnable {
	Producer producer;

	public EvenNumberConsumerThread(Producer producer) {
		this.producer = producer;
	}

	@Override
	public void run() {
		int i = 0;
		while (i <= 50) {
			this.producer.printEvenNumber();
		     i=i+1;
		}
	}
}
