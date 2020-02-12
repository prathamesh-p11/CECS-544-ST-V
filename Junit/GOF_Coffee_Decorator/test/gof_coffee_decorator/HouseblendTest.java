/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof_coffee_decorator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author prathamesh
 */
public class HouseblendTest {
    
    public HouseblendTest() {
    }

    
    @Test
    public void testGetDesc() {
        System.out.println("getDesc");
        Houseblend instance = new Houseblend();
        String expResult = "Houseblend";
        String result = instance.getDesc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCost() {
        System.out.println("cost");
        Houseblend instance = new Houseblend();
        double expResult = 0.99;
        double result = instance.cost();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
