package com.app.soap.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.soap.stub.DetailsType;
import com.app.soap.stub.GetBankResponseType;
import com.app.soap.stub.GetBankType;
import com.app.soap.stub2.ObjectFactory;
import com.app.soap.stub2.QUERYSINGLEJRNLIOFSREQ;
import com.app.soap.stub2.QUERYSINGLEJRNLIOFSREQ.FCUBSBODY;

@RestController
@RequestMapping("/")
public class BlzController {

    @Autowired
    private BlzServiceAdapter blzServiceAdapter;

//    @GetMapping
//    public DetailsType sum(@RequestParam String code){
//        ObjectFactory objectFactory = new ObjectFactory();
//        GetBankType type = new GetBankType();
//        type.setBlz(code);
//        GetBankResponseType response =  blzServiceAdapter.getBank("https://10.137.160.19:9012/FCUBSDEService/FCUBSDEService", objectFactory.createGetBank(type));
//        return response.getDetails();
//    }
    
    @GetMapping
    public FCUBSBODY sum(@RequestParam String code){
        ObjectFactory objectFactory = new ObjectFactory();
        GetBankType type = new GetBankType();
        type.setBlz(code);
//        GetBankResponseType response =  blzServiceAdapter.getBank("https://10.137.160.19:9012/FCUBSDEService/FCUBSDEService", objectFactory.createGetBank(type));
        QUERYSINGLEJRNLIOFSREQ response =  blzServiceAdapter.getBank("https://10.137.160.19:9012/FCUBSCoreService/FCUBSCoreService", objectFactory.createQUERYSINGLEJRNLIOFSREQ());
        return response.getFCUBSBODY();
    }
}