package ram.learn.customcontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ram.learn.model.Employee;

@RestController
public class EmployeeRestController {

	@GetMapping("/find/{id}")
	public ResponseEntity<Employee> getOneEmployee(
			@PathVariable Integer id)
	{
		if(id!=5)
			throw new EmployeeNotFoundException("EMPLOYEE NOT EXIST " + id);
		
		return ResponseEntity.ok(new Employee(id,"SAM"));
	}
}
