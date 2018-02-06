package com.ronak.tech.threading.latches;

import java.util.concurrent.CountDownLatch;

public class FoodProcessor implements Runnable {
	CountDownLatch countDownLatch;
	String[] items;

	public FoodProcessor(CountDownLatch countDownLatch, String[] items) {
		this.countDownLatch = countDownLatch;
		this.items = items;
	}

	@Override
	public void run() {
		System.out.println("Order is successfully placed. Please wait...");
		System.out.println("processing...");
		for (int i = 0; i < items.length; i++) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\nPrepared " + items[i] + " .\n");
			System.out.println("Value of countdownlatch before processing :" + countDownLatch.getCount());
			countDownLatch.countDown();
			System.out.println("Value of countdownlatch after processing :" + countDownLatch.getCount());
		}
	}
}
