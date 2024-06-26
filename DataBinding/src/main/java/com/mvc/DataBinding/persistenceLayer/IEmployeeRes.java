package com.mvc.DataBinding.persistenceLayer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mvc.DataBinding.Controllers.EmployeePojo;


@Repository
public interface IEmployeeRes extends CrudRepository<EmployeePojo, String> 
{

}
