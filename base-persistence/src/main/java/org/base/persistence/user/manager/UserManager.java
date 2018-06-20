package org.base.persistence.user.manager;

import javax.annotation.Resource;

import org.base.persistence.user.dao.UserDao;
import org.base.persistence.user.domain.UserDO;
import org.springframework.stereotype.Component;

import com.sfebiz.common.dao.BaseDao;
import com.sfebiz.common.dao.helper.DaoHelper;
import com.sfebiz.common.dao.manager.BaseManager;

@Component("userManager")
public class UserManager extends BaseManager<UserDO>{

	@Resource
	private UserDao userDao;
	
	@Override
	public BaseDao<UserDO> getDao() {
		return userDao;
	}
	
	public static void main(String[] args) {
        DaoHelper.genXMLWithFeature("D:/workspace/base/base-persistence/src/main/resources/sqlmap/user.xml",
                        UserDao.class,
                        UserDO.class,
                "sc_demo", true);
    }

}
