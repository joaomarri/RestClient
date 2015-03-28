package com.component.rest.proxy;

import java.net.InetSocketAddress;
import java.net.Proxy;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@PropertySource("classpath:config.properties") 
public final class RestProxyTemplate {
 
    private RestTemplate restTemplate;
 
    @Value("${proxy.host}")
    String host;
   
    @Value("${proxy.port}")
    String port;
 
    @PostConstruct
    public void init(){
        int portNr = -1;
        try {
            portNr = Integer.parseInt(port);
        } catch (NumberFormatException e) {
           
        }
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        InetSocketAddress address = new InetSocketAddress(host, portNr);
        Proxy proxy = new Proxy(Proxy.Type.HTTP,address);
        factory.setProxy(proxy);
 
        this.restTemplate = new RestTemplate();
        this.restTemplate.setRequestFactory(factory);
    }
 
    public RestTemplate getTemplate() {
        return restTemplate;
    }
}


