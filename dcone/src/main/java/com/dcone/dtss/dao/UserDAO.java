package com.dcone.dtss.dao;

import com.dcone.dtss.model.dc_user;

public class UserDAO {
	/**
	 * ͨ��UID��ȡ�û�����
	 * @author jszhang
	 * @param uid �û�id
	 * @return ָ��ID���û�dc_user����
	 */
	public static dc_user getUserByUid(int uid) {
		
		return null;
	}
	
	public static dc_user getUserByItcode(String itcode) {
		return null;
	}
	
	public static int createUser(String itcode, String username) {
		return 0;
	}
	
	public static boolean checkUserInfo(String itcode, String username) {
		return false;
	}
	/**
	 * �޸����ݿ�,�޸�model,����û�����
	 * @param uid
	 * @return
	 */
	public static boolean lockUserById(int uid) {
		return false;
	}
	/**
	 * 
	 * @param itcode
	 * @return
	 */
	public static boolean lockUserByItcode(String itcode) {
		return false;
	}
	
	public static boolean unlockUserByID(int id) {
		return false;
	}
	
	
	public static boolean isLock(int uid) {
		return false;
	}
	
	
}
