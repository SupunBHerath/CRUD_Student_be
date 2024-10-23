package edu.iuhs.crud_student.exception;

import edu.iuhs.crud_student.exception.impl.NotFoundException;
import edu.iuhs.crud_student.model.ErrorException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalHandleException {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorException> handleNotFoundException(NotFoundException ex) {
        ErrorException errorResponse =   ErrorException.builder().status("FAILED").message(ex.getMessage()).build();
        return ResponseEntity.ok().body(errorResponse);

    }
}
