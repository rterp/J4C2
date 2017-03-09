/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumzerotrading.j4c2.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.base.Strings;
import java.io.IOException;
import java.time.LocalDate;

/**
 *
 * @author RobTerpilowski
 */
public class LocalDateDeserializer extends JsonDeserializer<LocalDate> {

    @Override
    public LocalDate deserialize(JsonParser parser, DeserializationContext dc) throws IOException, JsonProcessingException {
        String value = parser.readValueAs(String.class);
        if( Strings.isNullOrEmpty(value) ){ 
            return null;
        } else {
            return LocalDate.parse(value);
        }
            
    }
    
    
}
