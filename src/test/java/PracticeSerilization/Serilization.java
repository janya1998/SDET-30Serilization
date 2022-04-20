package PracticeSerilization;

import java.io.File;
import java.io.IOException;
import java.lang.ref.Reference;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoClass.EmployeeDetails;

public class Serilization {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
//step1:create a java object for the pojo class and provide values in the arguments of the object
EmployeeDetails emp = new EmployeeDetails(1, "suhas", 98809877, "davangere", "suhas123@gmail.com");

System.out.println(emp);
//step2:create  object objectmapper class from jacksonmapper parsar
ObjectMapper obj=new ObjectMapper();
obj.writeValue(new File("./emp1.json"),emp);
	}
		
	}


