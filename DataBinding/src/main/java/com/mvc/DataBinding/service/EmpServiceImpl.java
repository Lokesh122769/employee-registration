package com.mvc.DataBinding.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.DataBinding.Controllers.EmployeePojo;
import com.mvc.DataBinding.persistenceLayer.IEmployeeRes;

@Service
public class EmpServiceImpl implements IEmpService
{
	@Autowired
	private IEmployeeRes repo;

	@Override
	public EmployeePojo saveEmployee(EmployeePojo emp)
	{
		return repo.save(emp);
	}

}
