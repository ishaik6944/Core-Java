package com.info.collections;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class XlsStudent {

	public static void main(String[] args) throws IOException {
		String xlfilename ="Students.xls";
		String path=System.getProperty("User.dir");
		String abspath=path+File.separator+xlfilename;
		String sheetname="Sheet1";
		HSSFWorkbook wb= new HSSFWorkbook();
		HSSFSheet sheet=wb.createSheet(sheetname);
		System.out.println("Enter the Total Number of Students:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Students[] stud=new Students[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter Student"+(i+1)+" Id:");
			int id=sc.nextInt();
			System.out.println("Enter Student"+(i+1)+" Name:");
			String name=sc.next();
			System.out.println("Enter Student"+(i+1)+" Fee:");
			double fee=sc.nextDouble();
			System.out.println("Enter Student"+(i+1)+" Sec:");			
			String sec=sc.next();
			stud[i]=new Students(id, name, fee, sec);
			HSSFRow row=sheet.createRow(i);
			HSSFCell cell0=row.createCell(0);
			cell0.setCellValue(stud[i].id);
			HSSFCell cell1=row.createCell(1);
			cell1.setCellValue(stud[i].name);
			HSSFCell cell2=row.createCell(2);
			cell2.setCellValue(stud[i].fee);
			HSSFCell cell3=row.createCell(3);
			cell3.setCellValue(stud[i].sec);
		
		
	}
		FileOutputStream fileout=new FileOutputStream(xlfilename);
		wb.write(fileout);
		fileout.flush();
		fileout.close();
		wb.close();
		sc.close();
		
	}

}
 class Students{
	int id;
	String name;
	double fee;
	String sec;
	Students() {
		
	}
	public Students(int id, String name, double fee, String sec) {
		//super();
		this.id = id;
		this.name = name;
		this.fee = fee;
		this.sec = sec;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getSec() {
		return sec;
	}
	public void setSec(String sec) {
		this.sec = sec;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", fee=" + fee + ", sec=" + sec + "]";
	}
	
	
}

