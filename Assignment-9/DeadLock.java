package com.info.assign9;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock {

	public static class Table {

		private static Lock Flashlight = new ReentrantLock();
		private static Lock Batteries = new ReentrantLock();

		public static void giveFlashLightAndBatteries() {
			try {
				Flashlight.lock();
				Batteries.lock();
				System.out.println("Lights on");
			} finally {
				Batteries.unlock();
				Flashlight.unlock();
			}
		}

		public static void giveBatteriesAndFlashLight() {
			try {
				Batteries.lock();
				Flashlight.lock();
				System.out.println("Lights on");
			} finally {
				Flashlight.unlock();
				Batteries.unlock();
			}
		}
	}

	public static void main(String[] args) {

		new Thread(new Runnable() {
			public void run() {
				Table.giveFlashLightAndBatteries();
			}
		}).start();

		new Thread(new Runnable() {
			public void run() {
				Table.giveBatteriesAndFlashLight();
			}
		}).start();
	}
}
