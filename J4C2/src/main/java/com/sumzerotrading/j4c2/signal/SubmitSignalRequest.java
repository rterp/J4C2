/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumzerotrading.j4c2.signal;

import com.sumzerotrading.j4c2.ApiCommand;

/**
 *
 * @author RobTerpilowski
 */
public class SubmitSignalRequest extends ApiCommand{
    
    protected String systemid;
    protected SignalInfo signal;

    public SubmitSignalRequest(String systemid, SignalInfo signal) {
        this.systemid = systemid;
        this.signal = signal;
    }


    public String getSystemid() {
        return systemid;
    }

    public void setSystemid(String systemid) {
        this.systemid = systemid;
    }

    public SignalInfo getSignal() {
        return signal;
    }

    public void setSignal(SignalInfo signal) {
        this.signal = signal;
    }
    
    
    
    
    
    public String getCommandName() {
        return "submitSignala";
    }
    
}
