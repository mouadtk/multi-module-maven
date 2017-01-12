package com.opm.app.dao;

import java.util.List;

import com.opm.app.model.Domain;
import com.opm.app.model.DomainProvider;

public interface DomainDao {

	public List<Domain>  getFreeDomains(int nbr);
	public boolean saveOrUpdate(Domain domain);
	public List<Domain> getDomainsGoupByProvider(int nbr, long idProvider);
	public DomainProvider getProvider();
	
}
