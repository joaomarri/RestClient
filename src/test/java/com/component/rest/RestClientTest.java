package com.component.rest;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.component.rest.RestClient;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=TestConfigSpring.class)
public class RestClientTest {

	@Autowired
	private RestClient restClient;
	
	@Test
	public void mustReturnInstanceRestTemplateSpring() {
		RestTemplate template = restClient.getRestTemplate();
		assertNotNull(template);
	}
}
