package com.day20;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

//자바에서 XML데이터 파싱하기
public class Test1 {

	public static void main(String[] args) {

		try {

			// Document Object Model : DOM(XML , HTML)
			// DOM Document 객체를 생성하기 위해 팩토리를 생성
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();

			DocumentBuilder parser = f.newDocumentBuilder();

			Document xmlDoc = null;

			String url = "book.xml";

			if (url.indexOf("http://") != -1) {

				URL u = new URL(url);
				InputStream is = u.openStream();
				xmlDoc = parser.parse(is);

			} else {

				xmlDoc = parser.parse(url);

			}

			// System.out.println(xmlDoc);

			// Element : xml문서의 요소를 표현하기위해 사용, w3c꺼 사용
			Element root = xmlDoc.getDocumentElement();
			System.out.println(root.getTagName());

			// 첫번째 book
			// Node : 각각의 요소를 읽기 위해 사용, w3c꺼 사용
			Node book1 = root.getElementsByTagName("book").item(0);
			System.out.println(((Element) book1).getAttribute("kind"));

			Node book2 = root.getElementsByTagName("book").item(1);
			System.out.println(((Element) book2).getAttribute("kind"));

			Node title = book1.getFirstChild();
			Node title1 = title.getNextSibling();

			System.out.println(title1.getNodeName());

			Node title1_1 = title1.getFirstChild();
			System.out.println(title1_1.getNodeValue());

			System.out.println("--------------");

			String out = "";
			String str = "";

			NodeList books = root.getElementsByTagName("book");

			for (int i = 0; i < books.getLength(); i++) {

				Node book = books.item(i);

				str = book.getNodeName();
				out += "노드명 : " + str;

				NamedNodeMap bookMap = book.getAttributes();
				str = bookMap.getNamedItem("kind").getNodeValue();
				
				out += ", kind: "+str;
				
				NodeList eList = book.getChildNodes();
				
				for (int j = 0; j < eList.getLength(); j++) {
					
					Node e = eList.item(j);
					
					if (e.getNodeType() == Node.ELEMENT_NODE) {
						
						str = ", " + e.getNodeName();
						out += str + " : ";
						out += e.getChildNodes().item(0).getNodeValue();
						
						
					}
					
				}
				out += "\n";
				
			}
			
			System.out.println(out);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}