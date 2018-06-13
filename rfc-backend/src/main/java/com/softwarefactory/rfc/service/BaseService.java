package com.softwarefactory.rfc.service;

import com.softwarefactory.rfc.model.Entity;

public interface BaseService {
	int saveEntity(Entity entity);
	Entity getEntity(int id);
}
