package AnnotationReader;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import Main.TabALIRunner;
import ScientificDocumentClasses.Article;
import ScientificDocumentClasses.Author;

public class AnnotationReader {
	
	public void readAnnotation(String FilePath)
	{
		  try {

				File fXmlFile = new File(FilePath);
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(fXmlFile);
						
				//optional, but recommended
				//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
				doc.getDocumentElement().normalize();

				System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
				TabALIRunner.currentArticle = new Article();
				System.out.println("----------------------------");
				NodeList nList = doc.getElementsByTagName("PMCID");
				TabALIRunner.currentArticle.setPMCID(nList.item(0).getTextContent());
				nList = doc.getElementsByTagName("PMID");
				TabALIRunner.currentArticle.setPMID(nList.item(0).getTextContent());
				nList = doc.getElementsByTagName("p-issn");
				TabALIRunner.currentArticle.setPissn(nList.item(0).getTextContent());
				nList = doc.getElementsByTagName("e-issn");
				TabALIRunner.currentArticle.setEissn(nList.item(0).getTextContent());
				nList = doc.getElementsByTagName("Title");
				TabALIRunner.currentArticle.setPaperTitle(nList.item(0).getTextContent());
				nList = doc.getElementsByTagName("Abstract");
				TabALIRunner.currentArticle.setArticleAbstract(nList.item(0).getTextContent());
				nList = doc.getElementsByTagName("KeyWord");
				for(int i = 0; i < nList.getLength();i++)
				{
					String key = nList.item(i).getTextContent();
					TabALIRunner.currentArticle.KeyWords.add(key);
				}
				nList = doc.getElementsByTagName("Author");
				for(int i = 0; i < nList.getLength();i++)
				{
					Author auth = new Author();

						Node nNode = nList.item(i);
						if (nNode.getNodeType() == Node.ELEMENT_NODE) {
							Element eElement = (Element) nNode;
							if(nNode.hasChildNodes()) System.out.println(nNode.getFirstChild().getNodeValue());
							auth.setAuthorName(eElement.getElementsByTagName("AuthorName").item(0).getTextContent());
							auth.setAuthorName(eElement.getElementsByTagName("AuthorAffiliation").item(0).getTextContent());
							auth.setAuthorName(eElement.getElementsByTagName("AuthorEmail").item(0).getTextContent());
							//System.out.println(auth.getAuthorEmail());
						}
						
					
					TabALIRunner.currentArticle.authors.add(auth);
				}
				System.out.println(nList.getLength());
				System.out.println(TabALIRunner.currentArticle.getArticleAbstract());
				

//				for (int temp = 0; temp < nList.getLength(); temp++) {
//
//					Node nNode = nList.item(temp);
//							
//					System.out.println("\nCurrent Element :" + nNode.getNodeName());
//							
//					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//
//						Element eElement = (Element) nNode;
//
////						System.out.println("Staff id : " + eElement.getAttribute("id"));
////						System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
////						System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
////						System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
////						System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
//
//					}
//				}
			    } catch (Exception e) {
				e.printStackTrace();
			    }
	}

}
