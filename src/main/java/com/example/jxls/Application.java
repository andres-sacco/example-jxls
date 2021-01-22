package com.example.jxls;

import com.example.jxls.service.CommonService;

import java.io.FileNotFoundException;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		CommonService service = new CommonService();
		
		service.createClientReport();
		
		service.createClientReportWithConditions();
	}

}
