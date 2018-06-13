package com.softwarefactory.rfc.dao;

import com.softwarefactory.rfc.model.Entity;

public interface BaseDao {
	int saveEntity(Entity entity);
	Entity getEntity(int id);
}
