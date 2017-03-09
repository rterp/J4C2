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
