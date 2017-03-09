/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
