/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.arsw.parcialfinal.controller;

import eci.arsw.parcialfinal.services.ConversionServices;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.springframework.http.converter.json.Jackson2ObjectMapperBuilder.json;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 2109950
 */

@RestController
@RequestMapping(value = "/conversion")
@Service
public class ConversionController {
    
    @Autowired
    private ConversionServices service;
    
    @RequestMapping(method = RequestMethod.GET, path = "/celTofar/{cel}")
    public ResponseEntity<?> celTofar(@PathVariable("cel") Float cel) {
        return new ResponseEntity<>(service.celTofar(cel), HttpStatus.ACCEPTED);
    }
    
     @RequestMapping(method = RequestMethod.GET, path = "/farTocel/{far}")
    public ResponseEntity<?> farTocel(@PathVariable("far") Float far) {
        return new ResponseEntity<>(service.farTocel(far), HttpStatus.ACCEPTED);
    }

    
}
