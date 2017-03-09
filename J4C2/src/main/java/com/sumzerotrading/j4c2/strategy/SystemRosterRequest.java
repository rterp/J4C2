/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumzerotrading.j4c2.strategy;

import com.sumzerotrading.j4c2.ApiCommand;
import java.util.Objects;

/**
 *
 * @author RobTerpilowski
 */
public class SystemRosterRequest extends ApiCommand {
    protected String filter = "active";


    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    @Override
    public String getCommandName() {
        return "getSystemRoster";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.filter);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SystemRosterRequest other = (SystemRosterRequest) obj;
        if (!Objects.equals(this.filter, other.filter)) {
            return false;
        }
        return true;
    }

    
    
    
    
    @Override
    public String toString() {
        return "SystemRosterRequest{" + "apikey=" + apikey + ", filter=" + filter + '}';
    }
    
    
    
}
