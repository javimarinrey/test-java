package xml.unmarshaller;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {
            File inputFile = new File("./src/xml/data.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Company.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Company company = (Company) jaxbUnmarshaller.unmarshal(inputFile);

            System.out.println("Employee:");
            List<Employee> list = company.getEmployee();
            for (Employee employee : list) {
                System.out.println(employee.getFirstname() + " " + employee.getLastname() + " " + employee.getSalary());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
