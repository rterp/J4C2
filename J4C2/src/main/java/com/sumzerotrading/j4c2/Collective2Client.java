/**
 * MIT License

Copyright (c) 2017  Rob Terpilowski

Permission is hereby granted, free of charge, to any person obtaining a copy of this software 
and associated documentation files (the "Software"), to deal in the Software without restriction, 
including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, 
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING 
BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE 
OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
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
