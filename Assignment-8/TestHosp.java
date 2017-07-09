package com.info.hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TestHosp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Address ad1 = new Address("1360 N", "Light Street", "Herndon", "Virginia", 20515);
		Address ad2 = new Address("1440 S", "Wnd Chase", "Beaumont", "Texas", 77705);
		Address ad3 = new Address("1515 W", "Legacy Circle", "Houston", "Texas", 77662);
		Doctor d1 = new Doctor(101, "Irfan", "Bones");
		Doctor d2 = new Doctor(103, "Raj", "ENT");
		Doctor d3 = new Doctor(102, "Nani", "Heart");
		// Doctor d4=new Doctor(104,"Sagar","Kidney");
		Hospital h1 = new Hospital("Arogya", d1, ad1);
		Hospital h2 = new Hospital("Vaibhav", d2, ad2);
		Hospital h3 = new Hospital("St Johns", d3, ad3);
		// Hospital h4=new Hospital("Apollo",d4,ad1);
		List<Hospital> hos = new ArrayList<Hospital>();
		hos.add(h1);
		hos.add(h2);
		hos.add(h3);
		for (Hospital h : hos) {
			System.out.println(h);
		}
		System.out.println("Will YOu enter Hospital Name and Address?..");
		String reply = sc.next();
		while (reply.equalsIgnoreCase("yes")) {
			System.out.println("Enter the Hospital Name and Address:");

			String hosName = sc.nextLine();
			Doctor d5 = new Doctor();
			System.out.println("Enter Address1: ");
			String addr1 = sc.nextLine();
			System.out.println("Enter Address2: ");
			String addr2 = sc.nextLine();
			System.out.println("Enter City: ");
			String city = sc.nextLine();
			System.out.println("Enter State: ");
			String state = sc.nextLine();
			System.out.println("Enter Zip: ");
			int zipC = sc.nextInt();
			Address a5 = new Address(addr1, addr2, city, state, zipC);
			Hospital h5 = new Hospital(hosName, d5, a5);
			if (hos.contains(h5)) {
				System.out.println("The Hospital Name is Already Exist.Please Check and Enter.");
			} else {
				hos.add(h5);
			}
		}
		System.out.println("Do You Want to check Nearest  Hospital Details With ZipCode ?..");
		reply = sc.next();
		while (reply.equalsIgnoreCase("yes")) {
			System.out.println("Enter the ZipCode that you want to Search for:");
			int zip = sc.nextInt();
			Hospital hospitalNearBy = null;
			for (Hospital h : hos) {
				if (zip - h.hospitalAddress.zipCode < zip) {
					zip = Math.abs(zip - h.hospitalAddress.zipCode);
					hospitalNearBy = new Hospital(h.hospitalName, h.doc, h.hospitalAddress);
				} else {
					System.out.println("Sorry We Don't Find Nearest Hospital For the Entered Zipcode");
				}
			}
			System.out.println("Near By Hospital : " + hospitalNearBy);
			break;
		}
		System.out.println("Do You Want to check Nearest  Hospital Details With ZipCode and Patient Illness ?..");
		reply = sc.next();
		while (reply.equalsIgnoreCase("yes")) {

			System.out.println("Enter The Zipcode and Illness :");
			int zipcd = sc.nextInt();
			String illness = sc.next();
			Hospital NearByHospital = null;
			for (Hospital h : hos) {
				if ((zipcd - h.hospitalAddress.zipCode < zipcd) && illness.equals(h.doc.specialization)) {
					zipcd = Math.abs(zipcd - h.hospitalAddress.zipCode);
					illness = h.doc.specialization;
					NearByHospital = new Hospital(h.hospitalName, h.doc, h.hospitalAddress);
				} else {
					System.out.println("Sorry We Could not Find the Nearest Hospital For The Patient Illness");
				}
			}

			System.out.println("Near By Hospital for Patient Illness is:" + NearByHospital);
			break;
		}
		System.out.println("Do You Want to check Doctor Details With Hospital Name ?..");
		reply = sc.next();
		while (reply.equalsIgnoreCase("yes")) {
			Map<Hospital, String> hmap = new TreeMap<Hospital, String>();
			hmap.put(h1, "Arogya");
			hmap.put(h2, "Vaibhav");
			hmap.put(h3, "St Johns");
			System.out.println("Enter Hospital Name :");
			String HospName = sc.next();
			Set<Hospital> hset = hmap.keySet();
			for (Hospital hosp : hset) {
				if (HospName.equals(hosp.hospitalName)) {
					System.out.println(hosp.getDoc());
				} else {
					System.out.println("No,The Hospital Name doesnot Match to our Hospitals.");
					break;
				}
			}
		}
		System.out.println("Do You Want to check Hospital Details With Specialization ?..");
		reply = sc.next();
		while (reply.equalsIgnoreCase("yes")) {
			Map<Hospital, String> hmap = new TreeMap<Hospital, String>();
			hmap.put(h1, "Arogya");
			hmap.put(h2, "Vaibhav");
			hmap.put(h3, "St Johns");
			System.out.println("Enter Specialization :");
			String Spec = sc.next();
			Set<Hospital> hset = hmap.keySet();
			for (Hospital hosp : hset) {
				if (Spec.equals(hosp.doc.specialization)) {
					System.out.println(hosp);
				} else {
					System.out.println(
							"We Cannot Found the Hospital Details for that Particular Specialization.Please Try Again.");
				}
				sc.close();
			}
		}

	}

}
