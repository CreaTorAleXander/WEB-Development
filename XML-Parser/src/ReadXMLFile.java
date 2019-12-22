import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;


import org.xml.sax.SAXException;

public class ReadXMLFile {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		File fXmlFile = new File("/Users/alexanderhess/Documents/Development/WEB-Workspace/XML-Parser-Java/staff.XML");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		System.out.println("RootElement: " + doc.getDocumentElement().getNodeName());
		
		NodeList nListe = doc.getElementsByTagName("staff");
		
		for(int i = 0; i< nListe.getLength();i++) {
			Node nNode = nListe.item(i);
			System.out.println(nNode.getNodeName());
		}
		
		
		
		
		

	}
}
