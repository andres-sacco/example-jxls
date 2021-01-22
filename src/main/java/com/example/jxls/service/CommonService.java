package com.example.jxls.service;

import com.example.jxls.common.Report;
import com.example.jxls.dao.CommonDao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class CommonService {
	
	private CommonDao dao;
	
	public CommonService() {
		dao = new CommonDao();
	}
	
	private void createCommonClientReport(String templateName, String outputName) throws FileNotFoundException {
		Report report = new Report();
		
		OutputStream outStream = new FileOutputStream(outputName);
		
		Map<String, Object> data = new HashMap<>();
		data.put("createdAt", "2021-01-01");
		data.put("clients", dao.getAllClients());
		
		report.createDocument(outStream, templateName, data);
	}
	
	public void createClientReport() throws FileNotFoundException {
		createCommonClientReport("clientsTemplate", "target/clients.xls");
	}
	
	public void createClientReportWithConditions() throws FileNotFoundException {
		createCommonClientReport("clientsMarkInactiveTemplate", "target/clientsMarkInactive.xls");
	}
}
