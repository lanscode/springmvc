/**
 * 
 */
package com.spmvc.dao;

import java.util.List;

import com.spmvc.models.Adress;
import com.spmvc.models.Employee;

/**
 * @author koria
 *
 */
public interface AdressDao {
	public void save(Adress adr);
    public void delete(Adress adr);
    public Adress find(int id);
    public List<Adress> findAll();

}
