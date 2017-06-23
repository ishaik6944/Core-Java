package com.info.corejava2;
import java.util.Scanner;

public class DestinationsDemo {

	public static void main(String[] args) {
		System.out.println("Enter The Number of Destinations:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Destinations[] dest = new Destinations[n];
		for (int i = 0; i < dest.length; i++) {
			System.out.println("Enter the Name Of destination:");
			String name = sc.next();
			System.out.println("Enter Name of Location:");
			String location = sc.next();
			System.out.println("Enter the Number of Hotels:");
			int k = sc.nextInt();
			String Hotels[] = new String[k];
			System.out.println("Enter the Names of Hotels:");
			for (int i1 = 0; i1 < Hotels.length; i1++) {
				Hotels[i1] = sc.next();
			}
			System.out.println("Enter The Number of Packages:");
			int n1 = sc.nextInt();
			double packageCost[] = new double[n1];
			System.out.println("Enter the each Package Cost");
			for (int i2 = 0; i2 < packageCost.length; i2++) {
				packageCost[i2] = sc.nextDouble();
			}
			System.out.println("Enter Number of Days for the Packages:");
			int n2 = sc.nextInt();
			int noOfDays[] = new int[n2];
			System.out.println("Enter each number of days for each Package");
			for (int i3 = 0; i3 < noOfDays.length; i3++) {
				noOfDays[i3] = sc.nextInt();

			}
			dest[i] = new Destinations(name, location, Hotels, packageCost, noOfDays);

		}

		System.out.println("Welcome to our website, Please enter your destination ?");
		String customerDest = sc.next();
		boolean found = false;
		for (int i4 = 0; i4 < dest.length; i4++) {
			Destinations d = dest[i4];
			if (d.getName().equals(customerDest)) {
				found = true;
				System.out.println("Good News...we found your destination with awesome package. Here are the details");
				System.out.println(d.toString());
				break;
			}
		}
		if (!found) {
			System.out.println("Ohh...Sorry, We couldn't find your destination. Please check beck.");
		}
		sc.close();
	}

}

class Destinations {
	private String name;
	private String location;
	private String[] hotels;
	private double[] packageCost;
	private int[] noOfDays;

	Destinations() {

	}

	public Destinations(String name, String location, String[] hotels, double[] packageCost, int[] noOfDays) {
		this.name = name;
		this.location = location;
		this.hotels = hotels;
		this.packageCost = packageCost;
		this.noOfDays = noOfDays;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String[] getHotels() {
		return hotels;
	}

	public void setHotels(String[] hotels) {
		this.hotels = hotels;
	}

	public double[] getPackageCost() {
		return packageCost;
	}

	public void setPackageCost(double[] packageCost) {
		this.packageCost = packageCost;
	}

	public int[] getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int[] noOfDays) {
		this.noOfDays = noOfDays;
	}

	@Override
	public String toString() {
		 String str= name + " is in " +  location + ":\n";
		for(int i5=0;i5<hotels.length;i5++){
			 str=str+Integer.toString(i5+1) +") In Hotel" + hotels[i5] + "a package of $." + Double.toString(packageCost[i5]) + "is available for " + Integer.toString(noOfDays[i5]) + "days\n";
		
		}
		return str;
		 
		
	}

}
