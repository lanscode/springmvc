/**
 * 
 */
package com.spmvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spmvc.dao.EmployeeDao;
import com.spmvc.models.Employee;

/**
 * @author koria
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public void save(Employee e) {
		System.out.println("into service for employee "+e.getName());
		dao.save(e);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the dao
	 */
	public EmployeeDao getDao() {
		return dao;
	}

	/**
	 * @param dao the dao to set
	 */
	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}
	
	
}
