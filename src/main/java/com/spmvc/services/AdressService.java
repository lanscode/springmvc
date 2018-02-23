/**
 * 
 */
package com.spmvc.services;

import java.util.List;

import com.spmvc.models.Adress;

/**
 * @author koria
 */
public interface AdressService {
	public void save(Adress adr);
    public void delete(Adress adr);
    public Adress find(int id);
    public List<Adress> findAll();
}
