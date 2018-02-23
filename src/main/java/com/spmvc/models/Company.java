/**
 * 
 */
package com.spmvc.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author koria
 *
 */
@Entity
@Table(name="companies")
public class Company {

	@Id
	private Long id;
	private String name;
	@NotEmpty
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
			name="companies_employees",
	        joinColumns= {@JoinColumn(name="company_id")},
	        inverseJoinColumns= {@JoinColumn(name="employee_id")}
			)
	private Set<Employee>employees=new HashSet<Employee>();
	public Company() {}
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the employees
	 */
	public Set<Employee> getEmployees() {
		return employees;
	}

	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	

}
