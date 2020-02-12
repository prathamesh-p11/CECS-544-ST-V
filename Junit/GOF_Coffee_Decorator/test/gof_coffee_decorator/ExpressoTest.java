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
public class ExpressoTest {
    
    public ExpressoTest() {
    }
    
    @Test
    public void testGetDesc() {
        System.out.println("getDesc");
        Expresso instance = new Expresso();
        String expResult = "Expresso";
        String result = instance.getDesc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCost() {
        System.out.println("cost");
        Expresso instance = new Expresso();
        double expResult = 1.99;
        double result = instance.cost();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
