package com.info.collections;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
enum Week{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	Week(){
		
	}
}

public class XlsFile {

	public static void main(String[] args) throws IOException {
		String excelFileName = "Week.xls";
		String path=System.getProperty("user.dir");
		String abspath=path+File.separator+excelFileName;
		String sheetName = "Sheet1";//name of sheet
		HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet(sheetName) ;
		for(int r=0;r<7;r++) {
			HSSFRow row=sheet.createRow(r);
			HSSFCell cell=row.createCell(0);
				Week[] week=Week.values();
				for(int i=0;i<=r;i++) {
	             String s=week[i].toString();
	             cell.setCellValue(s);
				}
		}	
		FileOutputStream fileout=new FileOutputStream(excelFileName);
		wb.write(fileout);
		fileout.flush();
		fileout.close();
		wb.close();

	}

}
