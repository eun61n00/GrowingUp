package com.hellomygreenworld.persistence;

import lombok.extern.log4j.Log4j;
import org.junit.Test;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

@Log4j
public class JDBCTests {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConnection() {

        try(Connection con =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/SpringWeb?serverTimezone=Asia/Seoul",
                            "root",
                            "P@ssw0rd")){
            System.out.println(con);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }
}
