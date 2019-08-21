package com.sophos.restlogiccore.utils;

import java.io.StringWriter;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;

import com.sophos.restlogiccore.services.TranslateService;

public class PrintDocumentXml {

	private static final Logger logger = LogManager.getLogger(TranslateService.class);

	public void printDocument(Document document) throws Exception {

		DOMSource domSource = new DOMSource(document);
		StringWriter writer = new StringWriter();
		StreamResult result = new StreamResult(writer);
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		transformer.transform(domSource, result);

		writer.toString();
		logger.info(writer);

	}

}
