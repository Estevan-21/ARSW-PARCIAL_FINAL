/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.arsw.parcialfinal.services;

import java.util.Map;

/**
 *
 * @author 2109950
 */
public interface ConversionServices {
    Map<Float, Float> celTofar(Float cel);
    
     Map<Float, Float> farTocel(Float far);
}
