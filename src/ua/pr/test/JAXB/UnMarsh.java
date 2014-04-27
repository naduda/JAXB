package ua.pr.test.JAXB;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnMarsh {

	public static void main(String[] args) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			 
			//We had written this file in marshalling example
			Employees emps = (Employees) jaxbUnmarshaller.unmarshal( new File("d:/GIT/Reports/test.xml") );
			 
			for(Employee emp : emps.getEmployees())
			{
			    System.out.println(emp.getId());
			    System.out.println(emp.getFirstName());
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
