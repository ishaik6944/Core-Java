package com.info.assign9;

public class StockPrices {

	public static void main(String[] args) {
		int profit = 0, minindex = 0, maxindex = 0;
		int[] stock = { 16, 24, 68, 45, 8, 65 };
		for (int i = 0; i < stock.length - 1; i++) {
			for (int j = i + 1; j < stock.length; j++) {
				if (stock[j] > stock[i] && profit < stock[j] - stock[i]) {
					profit = stock[j] - stock[i];
					minindex = i;
					maxindex = j;
				}
			}
		}
		System.out.println("When You Buy at index:" + minindex + " and sell at index: "+ maxindex + " Profit will be : " + profit);
	}
}
