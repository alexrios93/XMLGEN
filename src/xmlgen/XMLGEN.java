/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlgen;

/**
 *
 * @author Gonzalo
 */
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLGEN {
    public static void main(String argv[]) {
    String[][] StringArray = {{"department","prefix","course-number"},{"computerScience","CSCI","3333"}};

          try {

                DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
                Document doc = docBuilder.newDocument();
                Element rootElement = doc.createElement("Course");
                doc.appendChild(rootElement);

                for (int j = 0; j <StringArray.length; j++)
                {
                    if(StringArray[0][j]=="Prerequisite")
                    {
                        for (int i = 0; StringArray[0][i]=="Prerequisite"; i++) {
                            
                        }
                    }
                    else
                    {
                        Element Department = doc.createElement(StringArray[0][j]);
                        Department.appendChild(doc.createTextNode(StringArray[j][0]));
                        rootElement.appendChild(Department);
                    }
                }





            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("C:\\Users\\Gonzalo\\Documents\\NetBeansProjects\\XMLGEN\\File.XML"));

            // Output to console for testing
            // StreamResult result = new StreamResult(System.out);

            transformer.transform(source, result);

            System.out.println("File saved!");

      } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
      } catch (TransformerException tfe) {
            tfe.printStackTrace();
      }
    }
        

    private Element getElement(String elementName, String Text)throws Exception
    {
        

              DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
              DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
              Document doc = docBuilder.newDocument();
              Element e = doc.createElement(elementName);
              e.appendChild(doc.createTextNode(Text));
              
              return e;   
    }
}

                
                

		
//		Element Department = doc.createElement("Department");
//		Department.appendChild(doc.createTextNode("Computer Science"));
//                rootElement.appendChild(Department);
//                
//                Element Prefix = doc.createElement("Prefix");
//		Prefix.appendChild(doc.createTextNode("CSCI"));
//                rootElement.appendChild(Prefix);
//                                
//                Element Number = doc.createElement("Number");
//		Number.appendChild(doc.createTextNode("2388"));
//                rootElement.appendChild(Number);
//                
//                Element Name = doc.createElement("Name");
//		Name.appendChild(doc.createTextNode("Computer Science II HON"));
//                rootElement.appendChild(Name);
//                
//                Element Description = doc.createElement("Description");
//		Description.appendChild(doc.createTextNode("A second programming course includes problem solving by structured design. Provides an introduction to elementary data structures, including linked lists, stacks, queues, trees and graphs, and advanced programming techniques, including recursion, sorting and searching. "));
//                rootElement.appendChild(Description);
//                
//                Element Credithours = doc.createElement("Credit-hours");
//		Credithours.appendChild(doc.createTextNode("3.000"));
//                rootElement.appendChild(Credithours);
//                
//                Element Lecturehours = doc.createElement("Lecture-hours");
//		Lecturehours.appendChild(doc.createTextNode("3.000"));
//                rootElement.appendChild(Lecturehours);
//                
//                Element Labhours = doc.createElement("Lab-hours");
//		Labhours.appendChild(doc.createTextNode("0.000"));
//                rootElement.appendChild(Labhours);
//                
//                Element Level = doc.createElement("Level");
//		Level.appendChild(doc.createTextNode("Undergraduate"));
//                rootElement.appendChild(Level);
//                
//                Element Scheduletype = doc.createElement("Schedule-type");
//		Scheduletype.appendChild(doc.createTextNode("Lecture"));
//                rootElement.appendChild(Scheduletype);
//                
//                Element Prerequisite = doc.createElement("Prerequisite");
//		Prerequisite.appendChild(doc.createTextNode("Undergraduate level CSCI 1378 Minimum Grade of D or Undergraduate level CSCI 1370 Minimum Grade of D or Undergraduate level CMPE 1370 Minimum Grade of D"));
//                rootElement.appendChild(Prerequisite);
//                
//                Element Corequisite = doc.createElement("Co-requisite");
//		Corequisite.appendChild(doc.createTextNode("None"));
//                rootElement.appendChild(Corequisite);
//                
//                Element Courseattributes = doc.createElement("Course-attributes");
//		Courseattributes.appendChild(doc.createTextNode("Degree Elective, CS Instruction Fee -LU"));
//                rootElement.appendChild(Courseattributes);
//                
//                Element Legacynumber = doc.createElement("Legacy-number");
//		Legacynumber.appendChild(doc.createTextNode("None"));
//                rootElement.appendChild(Legacynumber);
//                
//                Element Crosslisted = doc.createElement("Cross-listed");
//		Crosslisted.appendChild(doc.createTextNode("CMPE 2388"));
//                rootElement.appendChild(Crosslisted);
//
//                Element Restrictions = doc.createElement("Restrictions");
//		Restrictions.appendChild(doc.createTextNode("May not be enrolled in one of the following Programs:      \n" +
//"dnu MED in Educational Admin \n" +
//"MPA in Public Administration \n" +
//"Bus. Admin Accelerated online \n" +
//"May not be enrolled in one of the following Levels:      \n" +
//"English Language Institute"));
//                rootElement.appendChild(Restrictions);
//
//		