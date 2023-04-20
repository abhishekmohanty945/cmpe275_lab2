package com.cmpe275.Lab2.exception;

import com.cmpe275.Lab2.models.CompositeKey;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class EmployeeNotFoundException extends RuntimeException {
    private final String ERROR_CODE = "EMPLOYEE_NOT_FOUND";

    private CompositeKey id;

    public EmployeeNotFoundException(final CompositeKey id) {
        super("Employee not found.");
        this.id = id;
    }
}
