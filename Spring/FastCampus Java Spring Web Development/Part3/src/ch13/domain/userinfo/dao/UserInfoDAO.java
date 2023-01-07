package ch13.domain.userinfo.dao;

import ch13.domain.userinfo.UserInfo;

import javax.jws.soap.SOAPBinding;

public interface UserInfoDAO {

    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);

}
