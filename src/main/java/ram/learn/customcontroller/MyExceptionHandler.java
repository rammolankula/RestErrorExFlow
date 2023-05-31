package ram.learn.customcontroller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import ram.learn.model.ErrorType;

//@ControllerAdvice
@RestControllerAdvice
public class MyExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	//@ResponseBody //JSON
	public ResponseEntity<ErrorType> handleEmpNotFoundEx(
			EmployeeNotFoundException ex) 
	{
		
		return new ResponseEntity<ErrorType>(
				new ErrorType(ex.getMessage(), 
						"NO_EMP_FOUND", 
						"DATA NOT FOUND FOR GIVEN ID", 
						"Employee"), 
				HttpStatus.BAD_REQUEST);
	}
	
}
