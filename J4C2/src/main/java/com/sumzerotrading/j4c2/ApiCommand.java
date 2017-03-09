/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumzerotrading.j4c2;

/**
 *
 * @author RobTerpilowski
 */
public abstract class ApiCommand {
    
    protected String apikey;
    
    public String getApikey() {
        return apikey;
    }
    
    public void setApikey(String apikey) {
        this.apikey = apikey;
    }
    
    public abstract String getCommandName();
    
}
