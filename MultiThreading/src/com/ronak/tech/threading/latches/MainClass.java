package com.ronak.tech.threading.latches;

import java.util.concurrent.CountDownLatch;

public class MainClass {
	public static void main(String[] args) throws InterruptedException {

		final CountDownLatch countDownLatch = new CountDownLatch(3);
		FoodProcessor foodProcessor = new FoodProcessor(countDownLatch, new String[] { "pizza", "pasta", "tea" });
		new Thread(foodProcessor).start();
		countDownLatch.await();
		System.out.println("Order is successfully processed. Ready to deliver.!!");
	}
}
