package com.freemahn.service.mapper;

import com.freemahn.domain.*;
import com.freemahn.service.dto.EmployeeDTO;

import org.mapstruct.*;
import org.springframework.stereotype.Component;

/**
 * Mapper for the entity Employee and its DTO EmployeeDTO.
 */
@Component
@Mapper(componentModel = "spring", uses = {})
public interface EmployeeMapper extends EntityMapper <EmployeeDTO, Employee> {


    default Employee fromId(Long id) {
        if (id == null) {
            return null;
        }
        Employee employee = new Employee();
        employee.setId(id);
        return employee;
    }
}
