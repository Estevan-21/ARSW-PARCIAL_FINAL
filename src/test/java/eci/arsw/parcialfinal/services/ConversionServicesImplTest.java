/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.arsw.parcialfinal.services;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2109950
 */
public class ConversionServicesImplTest {
    
    public ConversionServicesImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of celTofar method, of class ConversionServicesImpl.
     */
    @Test
    public void testCelTofar() {
        System.out.println("celTofar");
        Float cel = (float) 10 ;
        ConversionServicesImpl instance = new ConversionServicesImpl();
        Map<Float, Float> expResult = new ConcurrentHashMap<>();
        expResult.put((float)10,(float)50);
        System.out.println(expResult.toString());
        Map<Float, Float> result = instance.celTofar(cel);
        System.out.println(result.toString());
        assertEquals(expResult, result);        
    }

    /**
     * Test of farTocel method, of class ConversionServicesImpl.
     */
    @Test
    public void testFarTocel() {
        System.out.println("farTocel");
        Float far = (float) 10;
        ConversionServicesImpl instance = new ConversionServicesImpl();
        Map<Float, Float> expResult = new ConcurrentHashMap<>();
        expResult.put((float)10,(float)-12.222223);
        System.out.println(expResult.toString());
        Map<Float, Float> result = instance.farTocel(far);
        System.out.println(result.toString());
        assertEquals(expResult, result);        
    }
    
}
