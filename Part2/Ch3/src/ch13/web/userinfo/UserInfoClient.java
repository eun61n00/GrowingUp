package ch13.web.userinfo;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDAO;
import ch13.domain.userinfo.dao.mysql.UserInfoMysqlDAO;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDAO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties(); //pair로 읽어들이는 객체
        prop.load(fis);
        String dbType = prop.getProperty("DB-TYPE");

        UserInfo userInfo = new UserInfo();
        UserInfoDAO userInfoDao = null;

        if (dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMysqlDAO();
        }
        else if (dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDAO();
        }
        else {
            System.out.println("DB Error");
            return ;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

    }

}
