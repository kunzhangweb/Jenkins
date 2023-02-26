package com.everydalab.erm.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class EmployeeDataAccessService {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public EmployeeDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Employee> selectAllEmployees() {
//        return List.of(
//                new Employee(
//                        UUID.randomUUID(),
//                        "Andy",
//                        "Lau", Employee.Gender.MALE,
//                        "andyLau@gmail.com",
//                        "202-103-5868"
//                ),
//                new Employee(
//                        UUID.randomUUID(),
//                        "Jennifer",
//                        "Chou",
//                        Employee.Gender.FEMALE,
//                        "jennychou@yahoo.com",
//                        "646-290-5668"
//                )
//        );  // end return
        String sql = "";
        List<Employee> employees = jdbcTemplate.query(sql, (resultSet, i) -> {
            return null;
        });

        return null;
        // emp Andy
        // emp Jennifer
        // emp Natsumi

    }   // end selectAllEmployees

}   // end class
