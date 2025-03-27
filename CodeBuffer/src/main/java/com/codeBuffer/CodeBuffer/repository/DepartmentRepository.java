package com.codeBuffer.CodeBuffer.repository;

import com.codeBuffer.CodeBuffer.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// unlike the service package you don.t need to create an actual implementation class instead you extend by jpa repository and specify the entity and the datatype for the primary key

public interface DepartmentRepository extends JpaRepository<Department , Long> {
  //  public Department findByDepartmentName(String departmentName);
    public Department findByDepartmentNameIgnoreCase(String departmentName);
}
