package org.base.service.user;

import org.base.persistence.user.domain.UserDO;

public interface UserService {

	public UserDO getUser(Long userId);
	
	public void insert(UserDO userDO);
	
	public void update(Long id,String name);
}
