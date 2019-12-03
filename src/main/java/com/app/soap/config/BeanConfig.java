package com.app.soap.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class BeanConfig {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.app.soap.stub2");
		return marshaller;
	}

	@Bean
	public BlzServiceAdapter soapConnector(Jaxb2Marshaller marshaller) {
		BlzServiceAdapter client = new BlzServiceAdapter();
		//client.setDefaultUri("http://www.thomas-bayer.com/axis2/services/BLZService");
		client.setDefaultUri("https://10.137.160.19:9012/FCUBSCoreService/FCUBSCoreService");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
