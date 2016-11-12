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
import javax.xml.transform.OutputKeys;
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
    
    String[] StringArray1 = {  "Department", 
                                "Prefix",
                                "Number",
                                "Name",
                                "Description",
                                "Credit-hours",
                                "Lecture-hours",
                                "Lab-hours",
                                "Level",
                                "Schedule-type",
                                "Prerequisite",
                                "Co-requisite",
                                "Course-attributes",
                                "Legacy-number",
                                "Cross-listed",
                                "Restrictions",
                                };
    String[] StringArray2 = {  "Computer Science",
                                "CSCI", 
                                "2388",
                                "Computer Science II HON",
                                "A second programming course includes problem solving by structured design. Provides an introduction to elementary data structures, including linked lists, stacks, queues, trees and graphs, and advanced programming techniques, including recursion, sorting and searching.",
                                "3.000", 
                                "3.000",
                                "0.000", 
                                "Undergraduate",
                                "Lecture", 
                                "Undergraduate level CSCI 1378 Minimum Grade of D or Undergraduate level CSCI 1370 Minimum Grade of D or Undergraduate level CMPE 1370 Minimum Grade of D ",
                                "None",
                                "Degree Elective, CS Instruction Fee -LU",
                                "None",
                                "CMPE 2388",
                                "May not be enrolled in one of the following Programs: dnu MED in Educational Admin MPA in Public Administration Bus. Admin Accelerated online May not be enrolled in one of the following Levels: English Language Institute"};

        try {
              
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Course");
            doc.appendChild(rootElement);

                for (int i = 0; i <StringArray1.length; i++) {
                    Element Prefix = doc.createElement(StringArray1[i]);
                    Prefix.appendChild(doc.createTextNode(StringArray2[i]));
                    rootElement.appendChild(Prefix);
                }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("C:\\file.xml"));


            transformer.transform(source, result);

            System.out.println("File saved!");

            } catch (ParserConfigurationException pce) {
                    pce.printStackTrace();
            } catch (TransformerException tfe) {
                    tfe.printStackTrace();
            }
    }               }
	