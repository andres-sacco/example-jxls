package com.example.jxls.common;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Map.Entry;

import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Report {

	private static final Logger logger = LoggerFactory.getLogger(Report.class);

	public void createDocument(OutputStream outStream, String templateName, Map<String, Object> data) {
		logger.debug("Start creation of document");

		String pathTemplateName = ("/reports/").concat(templateName).concat(".xls");
		try(InputStream input = this.getClass().getResourceAsStream(pathTemplateName)) {//1
		
            Context context = new Context();
            
            for (Entry<String, Object> element : data.entrySet()) { // 2
            	context.putVar(element.getKey(), element.getValue());
			}
            
            JxlsHelper.getInstance().processTemplate(input, outStream, context); // 3

		} catch (Exception exception) {
			logger.error("Fail to generate the document", exception);
		} finally {
			closeAndFlushOutput(outStream); // 4
		}
	}

	private void closeAndFlushOutput(OutputStream outStream) {
		try {
			outStream.flush();
			outStream.close();
		} catch (IOException exception) {
			logger.error("Fail to flush and close the output", exception);
		}
	}
}
