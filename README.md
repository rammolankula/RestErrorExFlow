# RestErrorExFlow
Rest error exception flow
###### Exception Handling in Spring Boot ReST
###### Default Error Message (Boot ReST) + @ResponseStatus
###### Customized Error Message - @ControllerAdvice, @ExceptionHandler
###### Default Error Message (Boot ReST) + @ResponseStatus
###### In this case we are using default message given by BasicErrorController#error
######   (ResponseEntity(T) type--> JSON) format.
###### Here, we can customize only Status and message

{
    "timestamp": "2023-06-01T11:24:28+05:30",
    "status": 404,
    "error": "Not Found",
    "trace": ....
    "message": "EMPLOYEE NOT EXIST 50",
    "path": "/find/45"
}
