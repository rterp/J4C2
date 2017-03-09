/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumzerotrading.j4c2;

import com.sumzerotrading.j4c2.signal.SubmitSignalRequest;
import com.sumzerotrading.j4c2.strategy.SystemRosterRequest;
import com.sumzerotrading.j4c2.strategy.SystemDescriptor;
import com.sumzerotrading.j4c2.strategy.SystemRosterResponse;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.log4j.Logger;

/**
 * Client used for submitting REST requests to Collective2
 * 
 * @author RobTerpilowski
 */
public class Collective2Client {
    
    protected static Logger logger = Logger.getLogger(Collective2Client.class);
    protected String url = "https://api.collective2.com/world/apiv3";
    protected String apiKey;
    
    
    public Collective2Client(String apiKey) {
        this.apiKey = apiKey;
    }
    
    
    public List<SystemDescriptor> getSystemRoster( SystemRosterRequest request ) {
        Response response = submitRequest(request);
        logger.info("Response is: " + response);
        SystemRosterResponse rosterResponse = response.readEntity(SystemRosterResponse.class);
        
        List<SystemDescriptor> responseList = rosterResponse.getSystemDescriptors();
        logger.info("Response List size: " + responseList.size());
        
        return responseList;
    }
    
    /**
     * Submit a request for a new trade signal to C2
     * @param request The SubmitSignalRequest to submit.
     */
    public void submitTradeSignal( SubmitSignalRequest request ) {
        Response response = submitRequest(request);

        logger.info("Response from C2: " + response);
        logger.info("Response string: " + response.readEntity(String.class));
        
    }
    
    
    protected Response submitRequest( ApiCommand command ) {
        Client client = getClient();
        command.setApikey(apiKey);
        WebTarget target = client.target(url).path(command.getCommandName());
        Response response = target.request(MediaType.APPLICATION_JSON_TYPE)
                .post(Entity.entity(command, MediaType.APPLICATION_JSON_TYPE));
        
        return response;     
    }
        
    
    
    protected Client getClient() {
        return ClientBuilder.newClient();
    }
    
}
