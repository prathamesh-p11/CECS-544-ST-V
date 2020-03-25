/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statepattern;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author prathamesh
 */
public class FiftyStateTest {
    
    public FiftyStateTest() {
    }

    /**
     * Test of CoinReturn method, of class FiftyState.
     */
    
     @Test
    public void testSetCurrent() {
           System.out.println("SetCurrent");
        SodaState s = null;
        SodaMachine instance = new SodaMachine();
        instance.SetCurrent(s);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    
    @Test
    public void testCoinReturn() {
        System.out.println("CoinReturn");
        SodaMachine sm = new SodaMachine();
        FiftyState instance = new FiftyState();
        String expResult = instance.CoinReturn(sm);
        String result = instance.CoinReturn(sm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of CoinSlotDeposit method, of class FiftyState.
     */
    @Test
    public void testCoinSlotDeposit() {
        System.out.println("CoinSlotDeposit");
        SodaMachine sm = new SodaMachine();
        FiftyState instance = new FiftyState();
        String expResult = instance.CoinSlotDeposit(sm);
        String result = instance.CoinSlotDeposit(sm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SodaButton method, of class FiftyState.
     */
    @Test
    public void testSodaButton() {
        System.out.println("SodaButton");
        SodaMachine sm = new SodaMachine();
        FiftyState instance = new FiftyState();
        String expResult = "Your sod has been vended";
        String result = instance.SodaButton(sm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
