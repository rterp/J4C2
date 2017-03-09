/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumzerotrading.j4c2;

import com.google.common.base.Strings;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;

/**
 *
 * Retrieves the API key from a file on the local filesystem
 * @author RobTerpilowski
 */
public class FileApiKeyProvider implements ApiKeyProvider {

    public static final String PROPERTY_KEY = "key.file.location";
    
    /**
     * Gets the API key from the local filesystem.
     * Looks for a property named key.file.location in the Properties object.
     * The method assumes the API key is the first line in the file.
     * @param properties The properties object to retrieve the key location from.
     * @return The API key
     */
    @Override
    public String getAPIKey(Properties properties) {
        String fileLocation = properties.getProperty(PROPERTY_KEY);
        if( Strings.isNullOrEmpty(fileLocation)) {
            throw new J4C2Exception("Property " + PROPERTY_KEY + " not defined");
        }
        
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileLocation));
            return lines.get(0);
        } catch (IOException ex) {
            throw new J4C2Exception(ex);
        }
    }
    
    
}
