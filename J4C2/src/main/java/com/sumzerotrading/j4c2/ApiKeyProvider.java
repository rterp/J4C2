/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumzerotrading.j4c2;

import java.util.Properties;

/**
 * Gets the API key for accessing Collective2.
 * 
 * @author RobTerpilowski
 */
public interface ApiKeyProvider {


    /**
     * Gets the Collective2 API Key
     * @param properties Properties needed to access the API key
     * @return The API Key.
     */
    public String getAPIKey(Properties properties);
}
