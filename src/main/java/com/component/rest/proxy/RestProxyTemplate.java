package com.component.rest.proxy;

import java.net.InetSocketAddress;
import java.net.Proxy;

import javax.annotation.PostConstruct;

import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public final class RestProxyTemplate {
 
    private RestTemplate restTemplate;
 
    String host;
   
    String port;
 
    @PostConstruct
    public void init(){
        int portNr = -1;
        try {
            portNr = Integer.parseInt("8080");
        } catch (NumberFormatException e) {
           
        }
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        InetSocketAddress address = new InetSocketAddress("websense.test.com",portNr);
        Proxy proxy = new Proxy(Proxy.Type.HTTP,address);
        factory.setProxy(proxy);
 
        this.restTemplate = new RestTemplate();
        this.restTemplate.setRequestFactory(factory);
    }
 
    public RestTemplate getTemplate() {
        return restTemplate;
    }
}


