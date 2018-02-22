/**
 * 
 */
package com.spmvc.services;

import java.util.List;

import com.spmvc.models.Employee;

/**
 * @author koria
 *
 */
public interface EmployeeService {
	public void save(Employee e);
    public void delete(int id);
    public Employee find(int id);
    public List<Employee> findAll();
}
