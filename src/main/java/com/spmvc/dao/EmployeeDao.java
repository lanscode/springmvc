/**
 * 
 */
package com.spmvc.dao;

import java.util.List;

import com.spmvc.models.Employee;

/**
 * @author koria
 *
 */
public interface EmployeeDao {
	    public void save(Employee e);
	    public void delete(int id);
	    public Employee find(int id);
	    public List<Employee> findAll();
}
