package com.softwarefactory.rfc.dao;

import org.springframework.stereotype.Repository;

import com.softwarefactory.rfc.model.Entity;

@Repository
public class BaseDaoImpl implements BaseDao {

	@Override
	public int saveEntity(Entity entity) {
		return entity.getId() + 15;
	}

	@Override
	public Entity getEntity(int id) {
		Entity entity = new Entity();
		entity.setId(1231);
		entity.setName("Hi guys!");
		return entity;
	}

}
