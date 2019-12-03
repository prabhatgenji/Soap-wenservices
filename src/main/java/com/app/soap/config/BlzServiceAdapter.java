package com.app.soap.config;


import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.app.soap.stub.GetBankResponseType;
import com.app.soap.stub2.QUERYSINGLEJRNLIOFSREQ;
import com.app.soap.stub2.QUERYSINGLEJRNLIOFSRES;

import javax.xml.bind.JAXBElement;

public class BlzServiceAdapter extends WebServiceGatewaySupport {

//	public GetBankResponseType getBank(String url, Object request){
//		JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
//		return (GetBankResponseType) res.getValue();
//	}
	
	public QUERYSINGLEJRNLIOFSREQ getBank(String url, Object request){
		JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
		return (QUERYSINGLEJRNLIOFSREQ) res.getValue();
	}
}
