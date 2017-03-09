/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumzerotrading.j4c2;

/**
 *
 * 
 * @author RobTerpilowski
 */
public class J4C2Exception extends RuntimeException {

    public J4C2Exception() {
    }

    public J4C2Exception(String message) {
        super(message);
    }

    public J4C2Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public J4C2Exception(Throwable cause) {
        super(cause);
    }
    
    
}
