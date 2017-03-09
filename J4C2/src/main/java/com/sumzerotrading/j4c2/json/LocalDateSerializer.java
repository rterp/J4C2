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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author RobTerpilowski
 */
public class LocalDateSerializer extends JsonSerializer<LocalDate>{

    @Override
    public void serialize(LocalDate date, JsonGenerator generator, SerializerProvider provider) throws IOException, JsonProcessingException {
        String value = "";
        if(date == null ) {
            value = "";
        } else {
            value = date.format(DateTimeFormatter.ISO_DATE);
        }
        generator.writeObject(value);
    }
    
}
