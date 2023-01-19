package ch13.domain.userinfo;

import static java.lang.String.valueOf;

public class UserInfo {

    private static int serialId = 0;
    private String userId;
    private String password;
    private String userName;

    public UserInfo() {
        this.userId = "user" + valueOf(serialId);
        this.userName = "no-name";
        serialId++;
    }

    public UserInfo(String userId, String password, String userName) {
        this.userId = userId;
        this.password = password;
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
