package parser.com.xml.processor;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import parser.com.xml.model.InventorysModel;

public class XMLProcessor {

	public Set<InventorysModel> getInventorysObect() {
		InventorysModel inventorysModel=null;
		Set<InventorysModel> listOfParserXML=new HashSet<InventorysModel>();
		try {
			File inputFile = new File("src/input");
			int fileReceived=inputFile.listFiles().length;
			File []list=inputFile.listFiles();
			for(int i=0;i<fileReceived;i++){
				File file=new File(list[i].getAbsolutePath());
				inventorysModel= getInventorysModelObj(file);
				listOfParserXML.add(inventorysModel);
				file.renameTo(new File("src/output/"+file.getName()));
				System.out.println("file moved to output folder.file name:: " +file.getName());
			}
			
		}catch(Exception q){
			q.printStackTrace();
		}
		return listOfParserXML;
	}
	
	private InventorysModel getInventorysModelObj(File file){
		InventorysModel inventorysModel=new InventorysModel();
		
		try {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory
				.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(file);
		doc.getDocumentElement().normalize();
		System.out.println("Root element :"
				+ doc.getDocumentElement().getNodeName());
		NodeList nList = doc.getElementsByTagName(doc.getDocumentElement().getNodeName());
		System.out.println("----------------------------");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			System.out.println("\nCurrent Element :" + nNode.getNodeName());
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				inventorysModel.setVendorId(eElement.getElementsByTagName("VendorID").item(0).getTextContent());
				inventorysModel.setInterchangeControlNumber(eElement.getElementsByTagName("InterchangeControlNumber").item(0).getTextContent());
				inventorysModel.setTransactionSetIdentifierCode(eElement.getElementsByTagName("TransactionSetIdentifierCode").item(0).getTextContent());
				inventorysModel.setPurposeCode(eElement.getElementsByTagName("PurposeCode").item(0).getTextContent());
				inventorysModel.setReportTypeCode(eElement.getElementsByTagName("ReportTypeCode").item(0).getTextContent());
				inventorysModel.setReferenceNumber(eElement.getElementsByTagName("ReferenceNumber").item(0).getTextContent());
				inventorysModel.setCreateDate(eElement.getElementsByTagName("CreateDate").item(0).getTextContent());
				inventorysModel.setCreateTime(eElement.getElementsByTagName("CreateTime").item(0).getTextContent());
				inventorysModel.setIdentifierCode(eElement.getElementsByTagName("IdentifierCode").item(0).getTextContent());
				inventorysModel.setVendorNumber(eElement.getElementsByTagName("VendorNumber").item(0).getTextContent());
				inventorysModel.setVi_Qualifier(eElement.getElementsByTagName("Qualifier").item(0).getTextContent());
				inventorysModel.setVi_VendorWarehouseCode(eElement.getElementsByTagName("VendorWarehouseCode").item(0).getTextContent());
				inventorysModel.setLineItemID(eElement.getElementsByTagName("LineItemID").item(0).getTextContent());
				inventorysModel.setSk_Qualifier(eElement.getElementsByTagName("Qualifier").item(1).getTextContent());
				inventorysModel.setItemNumber(eElement.getElementsByTagName("ItemNumber").item(0).getTextContent());
				inventorysModel.setMeasurementCode(eElement.getElementsByTagName("MeasurementCode").item(0).getTextContent());
				inventorysModel.setSi_dq_Qualifier(eElement.getElementsByTagName("Qualifier").item(2).getTextContent());
				inventorysModel.setSi_dq_VendorWarehouseCode(eElement.getElementsByTagName("VendorWarehouseCode").item(0).getTextContent());
				inventorysModel.setQuantity(eElement.getElementsByTagName("Quantity").item(0).getTextContent());
			}
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return inventorysModel;
	}
}
