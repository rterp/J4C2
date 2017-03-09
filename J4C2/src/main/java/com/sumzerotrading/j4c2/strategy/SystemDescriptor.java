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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sumzerotrading.j4c2.json.BooleanDeserializer;
import com.sumzerotrading.j4c2.json.BooleanSerializer;
import com.sumzerotrading.j4c2.json.LocalDateDeserializer;
import com.sumzerotrading.j4c2.json.LocalDateSerializer;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author RobTerpilowski
 */
//@JsonIgnoreProperties(ignoreUnknown = true)
public class SystemDescriptor {
    
    
    @JsonProperty(value = "system_id" )
    protected String systemId;
    
    @JsonProperty(value = "ownerpersonid")
    protected String ownerPersonId;
    
    
    @JsonProperty(value = "isAlive")
    @JsonSerialize(using = BooleanSerializer.class)
    @JsonDeserialize(using = BooleanDeserializer.class)
    protected boolean isActive;

    
    @JsonProperty(value = "trades_stocks")
    @JsonSerialize(using = BooleanSerializer.class)
    @JsonDeserialize(using = BooleanDeserializer.class)    
    protected boolean tradesStocks;

    @JsonProperty(value = "trades_stocks_short")
    @JsonSerialize(using = BooleanSerializer.class)
    @JsonDeserialize(using = BooleanDeserializer.class)    
    protected boolean tradesStocksShort;
    
    
    @JsonProperty(value = "trades_options")
    @JsonSerialize(using = BooleanSerializer.class)
    @JsonDeserialize(using = BooleanDeserializer.class)        
    protected boolean tradesOptions;
    
    
    @JsonProperty(value = "trades_options_short")
    @JsonSerialize(using = BooleanSerializer.class)
    @JsonDeserialize(using = BooleanDeserializer.class)        
    protected boolean tradesOptionsShort;
    
    
    @JsonProperty(value = "trades_forex")
    @JsonSerialize(using = BooleanSerializer.class)
    @JsonDeserialize(using = BooleanDeserializer.class)        
    protected boolean tradesForex;
    
    @JsonProperty(value = "trades_futures")
    @JsonSerialize(using = BooleanSerializer.class)
    @JsonDeserialize(using = BooleanDeserializer.class)            
    protected boolean tradesFutures;
    
    @JsonProperty(value = "minimum_portfolio_size_required")
    protected int minimumPorfolioSize;
    
    @JsonProperty(value = "freeTrialPeriodDays")
    protected int freeTrialPeriodDays;
    
    
    @JsonProperty(value = "owner_screenname")
    protected String ownerScreenName;
    
    
    @JsonProperty(value = "created_when")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)       
    protected LocalDate createdDate;
    
    
    @JsonProperty(value = "system_name")
    protected String systemName;
    
    
    @JsonProperty(value = "recently_inactive_since")
    protected String recentlyInactiveSince;
    
    @JsonProperty( value = "equitycurve_startingcapital")
    protected int equityCurveStartingCapital;
    
    @JsonProperty( value = "monthlyFee")
    protected double monthlyFee;

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getOwnerPersonId() {
        return ownerPersonId;
    }

    public void setOwnerPersonId(String ownerPersonId) {
        this.ownerPersonId = ownerPersonId;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isTradesStocks() {
        return tradesStocks;
    }

    public void setTradesStocks(boolean tradesStocks) {
        this.tradesStocks = tradesStocks;
    }

    public boolean isTradesStocksShort() {
        return tradesStocksShort;
    }

    public void setTradesStocksShort(boolean tradesStocksShort) {
        this.tradesStocksShort = tradesStocksShort;
    }

    public boolean isTradesOptions() {
        return tradesOptions;
    }

    public void setTradesOptions(boolean tradesOptions) {
        this.tradesOptions = tradesOptions;
    }

    public boolean isTradesOptionsShort() {
        return tradesOptionsShort;
    }

    public void setTradesOptionsShort(boolean tradesOptionsShort) {
        this.tradesOptionsShort = tradesOptionsShort;
    }

    public boolean isTradesForex() {
        return tradesForex;
    }

    public void setTradesForex(boolean tradesForex) {
        this.tradesForex = tradesForex;
    }

    public boolean isTradesFutures() {
        return tradesFutures;
    }

    public void setTradesFutures(boolean tradesFutures) {
        this.tradesFutures = tradesFutures;
    }

    public int getMinimumPorfolioSize() {
        return minimumPorfolioSize;
    }

    public void setMinimumPorfolioSize(int minimumPorfolioSize) {
        this.minimumPorfolioSize = minimumPorfolioSize;
    }

    public int getFreeTrialPeriodDays() {
        return freeTrialPeriodDays;
    }

    public void setFreeTrialPeriodDays(int freeTrialPeriodDays) {
        this.freeTrialPeriodDays = freeTrialPeriodDays;
    }

    public String getOwnerScreenName() {
        return ownerScreenName;
    }

    public void setOwnerScreenName(String ownerScreenName) {
        this.ownerScreenName = ownerScreenName;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getRecentlyInactiveSince() {
        return recentlyInactiveSince;
    }

    public void setRecentlyInactiveSince(String recentlyInactiveSince) {
        this.recentlyInactiveSince = recentlyInactiveSince;
    }

    public int getEquityCurveStartingCapital() {
        return equityCurveStartingCapital;
    }

    public void setEquityCurveStartingCapital(int equityCurveStartingCapital) {
        this.equityCurveStartingCapital = equityCurveStartingCapital;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.systemId);
        hash = 71 * hash + Objects.hashCode(this.ownerPersonId);
        hash = 71 * hash + (this.isActive ? 1 : 0);
        hash = 71 * hash + (this.tradesStocks ? 1 : 0);
        hash = 71 * hash + (this.tradesStocksShort ? 1 : 0);
        hash = 71 * hash + (this.tradesOptions ? 1 : 0);
        hash = 71 * hash + (this.tradesOptionsShort ? 1 : 0);
        hash = 71 * hash + (this.tradesForex ? 1 : 0);
        hash = 71 * hash + (this.tradesFutures ? 1 : 0);
        hash = 71 * hash + this.minimumPorfolioSize;
        hash = 71 * hash + this.freeTrialPeriodDays;
        hash = 71 * hash + Objects.hashCode(this.ownerScreenName);
        hash = 71 * hash + Objects.hashCode(this.createdDate);
        hash = 71 * hash + Objects.hashCode(this.systemName);
        hash = 71 * hash + Objects.hashCode(this.recentlyInactiveSince);
        hash = 71 * hash + this.equityCurveStartingCapital;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.monthlyFee) ^ (Double.doubleToLongBits(this.monthlyFee) >>> 32));
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
        final SystemDescriptor other = (SystemDescriptor) obj;
        if (this.isActive != other.isActive) {
            return false;
        }
        if (this.tradesStocks != other.tradesStocks) {
            return false;
        }
        if (this.tradesStocksShort != other.tradesStocksShort) {
            return false;
        }
        if (this.tradesOptions != other.tradesOptions) {
            return false;
        }
        if (this.tradesOptionsShort != other.tradesOptionsShort) {
            return false;
        }
        if (this.tradesForex != other.tradesForex) {
            return false;
        }
        if (this.tradesFutures != other.tradesFutures) {
            return false;
        }
        if (this.minimumPorfolioSize != other.minimumPorfolioSize) {
            return false;
        }
        if (this.freeTrialPeriodDays != other.freeTrialPeriodDays) {
            return false;
        }
        if (this.equityCurveStartingCapital != other.equityCurveStartingCapital) {
            return false;
        }
        if (Double.doubleToLongBits(this.monthlyFee) != Double.doubleToLongBits(other.monthlyFee)) {
            return false;
        }
        if (!Objects.equals(this.systemId, other.systemId)) {
            return false;
        }
        if (!Objects.equals(this.ownerPersonId, other.ownerPersonId)) {
            return false;
        }
        if (!Objects.equals(this.ownerScreenName, other.ownerScreenName)) {
            return false;
        }
        if (!Objects.equals(this.systemName, other.systemName)) {
            return false;
        }
        if (!Objects.equals(this.recentlyInactiveSince, other.recentlyInactiveSince)) {
            return false;
        }
        if (!Objects.equals(this.createdDate, other.createdDate)) {
            return false;
        }
        return true;
    }

    
    
    
    
    
    @Override
    public String toString() {
        return "SystemDescriptor{" + "systemId=" + systemId + ", ownerPersonId=" + ownerPersonId + ", isActive=" + isActive + ", tradesStocks=" + tradesStocks + ", tradesStocksShort=" + tradesStocksShort + ", tradesOptions=" + tradesOptions + ", tradesOptionsShort=" + tradesOptionsShort + ", tradesForex=" + tradesForex + ", tradesFutures=" + tradesFutures + ", minimumPorfolioSize=" + minimumPorfolioSize + ", freeTrialPeriodDays=" + freeTrialPeriodDays + ", ownerScreenName=" + ownerScreenName + ", createdDate=" + createdDate + ", systemName=" + systemName + ", recentlyInactiveSince=" + recentlyInactiveSince + ", equityCurveStartingCapital=" + equityCurveStartingCapital + ", monthlyFee=" + monthlyFee + '}';
    }
    
    
    

    
    
    
    
}

