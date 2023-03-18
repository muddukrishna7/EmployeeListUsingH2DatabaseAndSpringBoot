/*
 * You can use the following import statements
 * 
 * import org.springframework.jdbc.core.RowMapper;
 * import java.sql.ResultSet;
 * import java.sql.SQLException;
 * 
 */

// Write your code here
package com.example.employee.model;

import com.example.employee.model.Employee;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import java.util.*;

public class EmployeeRowMapper implements RowMapper<Employee> {

    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Employee(
            rs.getInt("employeeId"),
            rs.getString("employeeName"),
            rs.getString("email"),
            rs.getString("department")
        );
    }
}