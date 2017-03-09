/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumzerotrading.j4c2.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

/**
 *
 * @author RobTerpilowski
 */
public class BooleanSerializer extends JsonSerializer<Boolean>{

    @Override
    public void serialize(Boolean b, JsonGenerator generator, SerializerProvider provider) throws IOException, JsonProcessingException {
        String value;
        if(b) {
            value = "1";
        } else {
            value = "0";
        }
        
        generator.writeObject(value);
    }
    
}
