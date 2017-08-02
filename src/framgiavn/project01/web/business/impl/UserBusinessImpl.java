package framgiavn.project01.web.business.impl;

import framgiavn.project01.web.business.UserBusiness;
import framgiavn.project01.web.dao.UserDAO;
import framgiavn.project01.web.model.User;

public class UserBusinessImpl implements UserBusiness {

	private UserDAO userDAO;

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public User findByUserId(Integer user_id) throws Exception {
		try {
			return getUserDAO().findByUserId(user_id);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public User findByUsername(String username) throws Exception {
		try {
			return getUserDAO().findByUsername(username);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}