package edu.iuhs.crud_student.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorException {

    private  String status;
    private  String message;
}
