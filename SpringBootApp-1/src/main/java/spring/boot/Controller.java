package spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/display")
	public String getData() {
		return "Something";
	}
	
	@Autowired
	Employee employee;
	
	@Autowired
	EmployeeInterface employeeInterface;
	
	@RequestMapping("/database")
	public String addData(Employee employee) {
		
		employeeInterface.save(employee);
		return "employee with name " + employee.getName() + " and id " + employee.getEmplId() + " added";
	}
	
	@RequestMapping("/delete/{emplId}")
	public String deleteData(@PathVariable(value="emplId") int emplId) {
		
		employeeInterface.deleteById(emplId);
		return "employee with id "  + emplId + " deleted";
	}

	@RequestMapping("/update/{emplId}")
	public String updateData(@PathVariable(value="emplId") int emplId) {
		
		
		return "employee with id "  + emplId + " updated";
	}
}
