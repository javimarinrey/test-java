package xml.unmarshaller;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Company {

    private List<Employee> employee;

    public Company() {
    }

    public Company(List<Employee> employee) {
        super();
        this.employee = employee;
    }

    @XmlElement
    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }
}
