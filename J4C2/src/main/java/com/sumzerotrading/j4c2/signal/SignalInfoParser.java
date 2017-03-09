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

/**
 *
 * @author RobTerpilowski
 */
public class SignalInfoParser {
    
    protected String action;
    protected String typeofsymbol;
    protected String duration;
    protected double stop;
    protected double limit;
    
}


/**
 * parameter	possible values	explanation
market	1	Set to 1 to declare this is a market order. If you do not supply limit or stop parameters, order will be assumed to be a market order.
profittarget	price	Used when submitting an position-entry order. Automatically create a conditional order to close the position at this limit price. When used in conjunction with stoploss, a One-Cancels-All group is created.
stoploss	price	Used when submitting an position-entry order. Automatically create a conditional order to close the position at this stop price. When used in conjunction with profittarget, a One-Cancels-All group is created.
conditionalupon	signalid	Do not allow this order to start "working" unless the parent order is filled (parent order has signalid = conditionalupon)
conditionalUponSignal	JSON signal hash	Same as above, but instead of supplying already-determined signalid, you can provide nested JSON containing entire signal hash
xreplace	signalid	Cancel the signalid specified, and if the cancel is successful, submit this new order to replace it
 */
