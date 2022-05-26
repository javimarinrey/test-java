package xml.dom4j;

import java.io.File;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

/**
 * El Dom4j es otra biblioteca que puede analizar archivos XML en Java.
 * El método read() de la clase SAXReader se utiliza para leer nodos en el documento.
 */
public class Main {

    public static void main(String[] args) {
        try {
            File inputFile = new File("./src/xml/data.xml");
            SAXReader reader = new SAXReader();
            Document document = reader.read( inputFile );
            System.out.println("Root element :" + document.getRootElement().getName());
            //Element classElement = document.getRootElement();
            List<Node> nodes = document.selectNodes("company/employee");
            System.out.println("----------------------------");
            for (Node node : nodes) {
                System.out.println("\nCurrent Element :"
                        + node.getName());
                System.out.println("First Name : "
                        + node.selectSingleNode("firstname").getText());
                System.out.println("Last Name : "
                        + node.selectSingleNode("lastname").getText());
                System.out.println("Salary : "
                        + node.selectSingleNode("salary").getText());
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

}
