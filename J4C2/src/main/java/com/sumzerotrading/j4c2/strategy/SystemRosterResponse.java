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
