/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.arsw.parcialfinal.services;

import eci.arsw.parcialfinal.controller.ConversionController;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2109950
 */
@Service 
public class ConversionServicesImpl implements ConversionServices {
    
    private static  Map<Float, Float> convert;
    /**
     *
     * @param cel
     * @return
     */
     public  Map<Float, Float> celTofar(Float cel){
         convert = new ConcurrentHashMap<>();
         float div=(float) 9/5;
         float far=(cel*div)+32;
         System.out.println(cel);
         System.out.println(div);
         
         convert.put(cel,far);
         return convert;
     }



    @Override
    public Map<Float, Float> farTocel(Float far) {
        convert = new ConcurrentHashMap<>();
        float div=(float) 5/9;
        float cel=(far-32)*div;
        convert.put(far,cel);
        return convert;
    }
     
     
    
}
