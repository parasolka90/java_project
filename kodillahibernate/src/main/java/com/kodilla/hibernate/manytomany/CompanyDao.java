package com.kodilla.hibernate.manytomany;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query
    List<Company> retrieveCompaniesStartWith(@Param("SUBST") String xyz);

    @Query(value = "SELECT * FROM companies WHERE company_name LIKE :ARG", nativeQuery = true)
    List<Company> findCompaniesByName(@Param("ARG") String name);
}
