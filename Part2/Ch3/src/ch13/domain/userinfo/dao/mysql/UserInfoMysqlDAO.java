package ch13.domain.userinfo.dao.mysql;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDAO;

public class UserInfoMysqlDAO implements UserInfoDAO {

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into MYSQL DB user ID = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into MYSQL DB user ID = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from  MYSQL DB user ID = " + userInfo.getUserId());
    }
}
