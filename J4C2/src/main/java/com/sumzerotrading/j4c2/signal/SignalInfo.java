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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sumzerotrading.j4c2.json.BooleanDeserializer;
import com.sumzerotrading.j4c2.json.BooleanSerializer;
import static com.sumzerotrading.j4c2.signal.SignalInfo.Duration.*;
import static com.sumzerotrading.j4c2.signal.SignalInfo.OrderType.*;
import java.util.Objects;

/**
 *
 * @author RobTerpilowski
 */
public class SignalInfo {
    
    public enum Action{BTO, STO, SSHORT, BTC, STC};
    public enum SymbolType {stock, option, future, forex}
    public enum Duration{DAY, GTC}
    public enum OrderType{MARKET, LIMIT, STOP}
    
    @JsonProperty(value = "action")
    protected Action action;
    
    @JsonProperty(value = "typeofsymbol")
    protected SymbolType symbolType;
    
    @JsonProperty(value = "duration")
    protected Duration duration = DAY;
    
    
    @JsonProperty(value = "market")
    @JsonSerialize( using = BooleanSerializer.class)
    @JsonDeserialize( using = BooleanDeserializer.class)
    protected boolean isMarketOrder;
    
    
    protected OrderType orderType = MARKET;
            
    @JsonProperty(value = "quant")
    protected int quantity = 0;
    
    @JsonProperty(value = "symbol")
    protected String ticker;
    
    @JsonProperty(value = "stop")
    protected double stopPrice = 0;
    
    @JsonProperty(value = "limit")
    protected double limitPrice = 0;
    
    @JsonProperty(value = "profittarget")
    protected double attachedProfitTarget = 0;
    
    @JsonProperty(value = "stoploss")
    protected double attachedStopLoss = 0;

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public SymbolType getSymbolType() {
        return symbolType;
    }

    public void setSymbolType(SymbolType symbolType) {
        this.symbolType = symbolType;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public boolean isIsMarketOrder() {
        return isMarketOrder;
    }

    public void setIsMarketOrder(boolean isMarketOrder) {
        this.isMarketOrder = isMarketOrder;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public double getStopPrice() {
        return stopPrice;
    }

    public void setStopPrice(double stopPrice) {
        this.stopPrice = stopPrice;
    }

    public double getLimitPrice() {
        return limitPrice;
    }

    public void setLimitPrice(double limitPrice) {
        this.limitPrice = limitPrice;
    }

    public double getAttachedProfitTarget() {
        return attachedProfitTarget;
    }

    public void setAttachedProfitTarget(double attachedProfitTarget) {
        this.attachedProfitTarget = attachedProfitTarget;
    }

    public double getAttachedStopLoss() {
        return attachedStopLoss;
    }

    public void setAttachedStopLoss(double attachedStopLoss) {
        this.attachedStopLoss = attachedStopLoss;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.action);
        hash = 41 * hash + Objects.hashCode(this.symbolType);
        hash = 41 * hash + Objects.hashCode(this.duration);
        hash = 41 * hash + (this.isMarketOrder ? 1 : 0);
        hash = 41 * hash + Objects.hashCode(this.orderType);
        hash = 41 * hash + this.quantity;
        hash = 41 * hash + Objects.hashCode(this.ticker);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.stopPrice) ^ (Double.doubleToLongBits(this.stopPrice) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.limitPrice) ^ (Double.doubleToLongBits(this.limitPrice) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.attachedProfitTarget) ^ (Double.doubleToLongBits(this.attachedProfitTarget) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.attachedStopLoss) ^ (Double.doubleToLongBits(this.attachedStopLoss) >>> 32));
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
        final SignalInfo other = (SignalInfo) obj;
        if (this.isMarketOrder != other.isMarketOrder) {
            return false;
        }
        if (this.quantity != other.quantity) {
            return false;
        }
        if (Double.doubleToLongBits(this.stopPrice) != Double.doubleToLongBits(other.stopPrice)) {
            return false;
        }
        if (Double.doubleToLongBits(this.limitPrice) != Double.doubleToLongBits(other.limitPrice)) {
            return false;
        }
        if (Double.doubleToLongBits(this.attachedProfitTarget) != Double.doubleToLongBits(other.attachedProfitTarget)) {
            return false;
        }
        if (Double.doubleToLongBits(this.attachedStopLoss) != Double.doubleToLongBits(other.attachedStopLoss)) {
            return false;
        }
        if (!Objects.equals(this.ticker, other.ticker)) {
            return false;
        }
        if (this.action != other.action) {
            return false;
        }
        if (this.symbolType != other.symbolType) {
            return false;
        }
        if (this.duration != other.duration) {
            return false;
        }
        if (this.orderType != other.orderType) {
            return false;
        }
        return true;
    }
    
    
    
    

    @Override
    public String toString() {
        return "SignalInfo{" + "action=" + action + ", symbolType=" + symbolType + ", duration=" + duration + ", isMarketOrder=" + isMarketOrder + ", orderType=" + orderType + ", quantity=" + quantity + ", ticker=" + ticker + ", stopPrice=" + stopPrice + ", limitPrice=" + limitPrice + ", attachedProfitTarget=" + attachedProfitTarget + ", attachedStopLoss=" + attachedStopLoss + '}';
    }
    
    
    
    

}


/**
 * parameter	possible values	explanation
action	BTO STO SSHORT BTC STC	BTO = Buy to Open (establish long position)
STO = Sell to Open (establish short position)
SSHORT = Sell Short (generally used for stocks, but STO and SSHORT can be used interchangeably)
BTC = Buy to Cover a short position
STC = Sell to Close a long position
typeofsymbol	stock option future forex	instruments like ETFs and mutual funds should be treated as a "stock"
Click here for C2 Symbols Help
duration	DAY GTC	
stop	stop price	
limit	limit price	
market	1	Set to 1 to declare this is a market order. If you do not supply limit or stop parameters, order will be assumed to be a market order.
profittarget	price	Used when submitting an position-entry order. Automatically create a conditional order to close the position at this limit price. When used in conjunction with stoploss, a One-Cancels-All group is created.
stoploss	price	Used when submitting an position-entry order. Automatically create a conditional order to close the position at this stop price. When used in conjunction with profittarget, a One-Cancels-All group is created.
conditionalupon	signalid	Do not allow this order to start "working" unless the parent order is filled (parent order has signalid = conditionalupon)
conditionalUponSignal	JSON signal hash	Same as above, but instead of supplying already-determined signalid, you can provide nested JSON containing entire signal hash
xreplace	signalid	Cancel the signalid specified, and if the cancel is successful, submit this new order to replace it
 */
