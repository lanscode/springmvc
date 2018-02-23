/**
 * 
 */
package com.spmvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spmvc.dao.AdressDao;
import com.spmvc.models.Adress;

/**
 * @author koria
 *
 */
public class AdressServiceImpl implements AdressService {

	@Autowired
	private AdressDao dao;
	
	public AdressServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(Adress adr) {
		dao.save(adr);
		
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
		return dao.findAll();
	}

	/**
	 * @return the dao
	 */
	public AdressDao getDao() {
		return dao;
	}

	/**
	 * @param dao the dao to set
	 */
	public void setDao(AdressDao dao) {
		this.dao = dao;
	}

}
