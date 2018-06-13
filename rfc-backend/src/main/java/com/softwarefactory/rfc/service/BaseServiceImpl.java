package com.softwarefactory.rfc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softwarefactory.rfc.dao.BaseDao;
import com.softwarefactory.rfc.model.Entity;

@Service
public class BaseServiceImpl implements BaseService {
	
	@Autowired
	BaseDao dao;

	@Override
	public int saveEntity(Entity entity) {
		return dao.saveEntity(entity);
	}

	@Override
	public Entity getEntity(int id) {
		return dao.getEntity(id);
	}

}
