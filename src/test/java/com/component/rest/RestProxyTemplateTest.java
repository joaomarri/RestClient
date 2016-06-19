package com.component.rest;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.component.rest.proxy.RestProxyTemplate;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=TestConfigSpring.class)
public class RestProxyTemplateTest {
	
	@Autowired
	private RestProxyTemplate rest;
	
	@Test
	public void mustReturnRestTemplate() {
		assertNotNull(rest.getTemplate());
	}

}
