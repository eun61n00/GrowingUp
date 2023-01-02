package com.hellomygreenworld.sample;

import static org.junit.Assert.assertNotNull;

import com.hellomygreenworld.ex00.sample.Hotel;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring-config/applicationContext.xml")
@Log4j
public class HotelTests {

    @Setter(onMethod_ = { @Autowired })
    private Hotel hotel;

    @Test
    public void testExist() {
        assertNotNull(hotel);

        log.info(hotel);
        log.info("-----------------------------");
        log.info(hotel.getChef());
    }

}
