package org.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class generateJvmReport {
	
	public static void reportJVM(String Jsonpath) {
		File f=new File("C:\\Users\\Ramesh\\eclipse-workspace\\SnuggleBugz\\target\\reports\\JvmReport");
		
		Configuration con=new Configuration(f, "SnuggleBugz");
		con.addClassifications("browser", "chrome");
		con.addClassifications("browser version", "97");
		con.addClassifications("platform", "window");
		con.addClassifications("OS Verion", "10");
		con.addClassifications("Sprint", "32");
		
		List<String> li=new ArrayList<String>();
		li.add(Jsonpath);
		
		ReportBuilder r=new ReportBuilder(li,con);
		r.generateReports();
		
		
		

	}
	

}
