package edu.iuhs.crud_student.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SuccessResponse {

    private  String status;
    private Object  data;
}
