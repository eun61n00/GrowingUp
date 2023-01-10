package com.hellomygreenworld.ex02.persistence;

import lombok.extern.log4j.Log4j;
import org.junit.Test;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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

        try(Connection connection =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/SpringMVC_ex",
                            "mvcex_user",
                            "P@ssw0rd")){
            log.info(connection);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }
}