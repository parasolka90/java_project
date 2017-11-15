package com.kodilla.hibernate.manytomany;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query
    List<Employee> retrieveEmployeeByLastname(@Param("LASTNAME") String lastname);

    @Query(value = "SELECT * FROM employees WHERE firstname LIKE :ARG " +
            "OR lastname LIKE :ARG", nativeQuery = true)
    List<Employee> findEmployeesByName(@Param("ARG") String name);
}
