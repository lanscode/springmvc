/**
 * 
 */
package com.spmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spmvc.models.Adress;
import com.spmvc.models.Employee;

/**
 * @author koria
 *
 */
@Repository
public class AdressDaoImpl implements AdressDao {
	
	@Autowired
	private HibernateTemplate template;

	public AdressDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(Adress adr) {
		this.template.save(adr);
		
	}

	@Override
	public void delete(Adress adr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Adress find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Adress> findAll() {
		return this.template.find("from Adress");
	}
	/**
	 * @return the template
	 */
	public HibernateTemplate getTemplate() {
		return template;
	}

	/**
	 * @param template the template to set
	 */
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}


}
