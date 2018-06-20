package org.base.service.user;

import javax.annotation.Resource;

import org.base.persistence.user.domain.UserDO;
import org.base.persistence.user.manager.UserManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserManager userManager;
	
	@Override
	public UserDO getUser(Long userId) {
		
		return userManager.getById(userId);
	}

	@Override
	@Transactional
	public void insert(UserDO userDO) {
		userManager.insert(userDO);
	}

	@Override
	@Transactional
	public void update(Long id, String name) {
		UserDO userDO = new UserDO();
		userDO.setId(id);
		userDO.setName(name);
		userManager.update(userDO);
	}
}
