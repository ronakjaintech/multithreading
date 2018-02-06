package com.ronak.tech.threading.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierMain {
	public static void main(String[] args) throws InterruptedException {
		final CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
		final CabService cabService = new CabService(cyclicBarrier);
		new Thread(cabService, "Passenger1").start();
		Thread.sleep(5000);
		new Thread(cabService, "Passenger2").start();
		Thread.sleep(5000);
		new Thread(cabService, "Passenger3").start();
		Thread.sleep(5000);
		new Thread(cabService, "Passenger4").start();
		Thread.sleep(5000);
		new Thread(cabService, "Passenger5").start();
		Thread.sleep(5000);
		new Thread(cabService, "Passenger6").start();
		Thread.sleep(5000);
	}

}
