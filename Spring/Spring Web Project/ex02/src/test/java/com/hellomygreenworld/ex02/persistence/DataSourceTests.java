package com.hellomygreenworld.ex02.persistence;

import static org.junit.Assert.fail;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.sql.DataSource;
import java.sql.Connection;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring-config/applicationContext.xml")
@Log4j
public class DataSourceTests {

    @Setter(onMethod_ = { @Autowired})
    private DataSource dataSource;
    @Test
    public void testConnection() {
        try (Connection connection = dataSource.getConnection()) {
            log.info(connection);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}
