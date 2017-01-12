package com.opm.app.dao;

import com.opm.app.model.ServerIP;

public interface IpDao {

	public boolean saveOrUpdate(ServerIP ip);
}
