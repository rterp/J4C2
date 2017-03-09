/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumzerotrading.j4c2.strategy;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author RobTerpilowski
 */
public class SystemRosterResponse {
    
    protected String ok;
    
    @JsonProperty(value = "response")
    protected List<SystemDescriptor> systemDescriptors = new ArrayList<>();

    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }


    public List<SystemDescriptor> getSystemDescriptors() {
        return systemDescriptors;
    }

    public void setSystemDescriptors(List<SystemDescriptor> systemDescriptors) {
        this.systemDescriptors = systemDescriptors;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.ok);
        hash = 47 * hash + Objects.hashCode(this.systemDescriptors);
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
        final SystemRosterResponse other = (SystemRosterResponse) obj;
        if (!Objects.equals(this.ok, other.ok)) {
            return false;
        }
        if (!Objects.equals(this.systemDescriptors, other.systemDescriptors)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SystemRosterResponse{" + "ok=" + ok + ", systemDescriptors=" + systemDescriptors + '}';
    }
    
    
    
    
}
