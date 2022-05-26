package xml.jdom2;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import java.io.File;
import java.util.List;


/**
 * Jdom2 es una biblioteca que proporciona soporte para el análisis de DOM usando clases de Java.
 * Usamos la clase SAXBuilder y el método build() para obtener datos en Documento y luego, usando el método getRootElement(),
 * obtenemos los elementos.
 */
public class Main {

    public static void main(String[] args) {
        try {
            File inputFile = new File("./src/xml/data.xml");
            SAXBuilder saxBuilder = new SAXBuilder();
            Document document = saxBuilder.build(inputFile);
            System.out.println("Root element :" + document.getRootElement().getName());
            Element classElement = document.getRootElement();

            List<Element> studentList = classElement.getChildren();
            System.out.println("----------------------------");

            for (Element student : studentList) {
                System.out.println("\nCurrent Element :"
                        + student.getName());
                System.out.println("First Name : "
                        + student.getChild("firstname").getText());
                System.out.println("Last Name : "
                        + student.getChild("lastname").getText());
                System.out.println("Salary : "
                        + student.getChild("salary").getText());
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
