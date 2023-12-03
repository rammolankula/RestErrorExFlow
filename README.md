# RestErrorExFlow
Rest error exception flow
<pre>
&#8594; Exception Handling in Spring Boot ReST
&#8594; Default Error Message (Boot ReST) + @ResponseStatus
&#8594; Customized Error Message - @ControllerAdvice, @ExceptionHandler
&#8594; Default Error Message (Boot ReST) + @ResponseStatus
&#8594; In this case we are using default message given by BasicErrorController#error
&#8594;   (ResponseEntity(T) type--> JSON) format.
&#8594; Here, we can customize only Status and message
</pre>

<pre>
{
    "timestamp": "2023-06-01T11:24:28+05:30",
    "status": 404,
    "error": "Not Found",
    "trace": ....
    "message": "EMPLOYEE NOT EXIST 50",
    "path": "/find/45"
}
</pre>
