package xml.javaPOJO;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * En caso de que queramos obtener datos XML en un tipo compatible con Java, podemos usar Java POJO para leer datos.
 * Aquí, usamos el tipo Employee ArrayList para agregar cada nodo usando el método add() y luego usamos el bucle for para iterar cada objeto.
 */
public class Main {

    public static void main(String[] args) throws ParserConfigurationException,
            SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("./src/xml/data.xml"));
        List<Employee> employees = new ArrayList<>();
        NodeList nodeList = document.getDocumentElement().getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element elem = (Element) node;
                String firstname = elem.getElementsByTagName("firstname")
                        .item(0).getChildNodes().item(0).getNodeValue();
                String lastname = elem.getElementsByTagName("lastname").item(0)
                        .getChildNodes().item(0).getNodeValue();
                double salary = Double.parseDouble(elem.getElementsByTagName("salary")
                        .item(0).getChildNodes().item(0).getNodeValue());
                employees.add(new Employee(firstname, lastname, salary));
            }
        }
        for (Employee empl : employees)
            System.out.println(empl.toString());
    }
}
