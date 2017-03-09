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
