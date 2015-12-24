package com.epam.hotel_demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.epam.hotel_demo.HotelDemoApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HotelDemoApplication.class)
@WebAppConfiguration
public class HotelDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
