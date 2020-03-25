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
public class ZeroStateTest {
    
    public ZeroStateTest() {
    }

    /**
     * Test of CoinReturn method, of class ZeroState.
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
        SodaMachine sm = null;
        ZeroState instance = new ZeroState();
        String expResult = instance.CoinReturn(sm);
        String result = instance.CoinReturn(sm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of CoinSlotDeposit method, of class ZeroState.
     */
    @Test
    public void testCoinSlotDeposit() {
        System.out.println("CoinSlotDeposit");
        SodaMachine sm = new SodaMachine();
        ZeroState instance = new ZeroState();
        String expResult = instance.CoinSlotDeposit(sm);
        String result = instance.CoinSlotDeposit(sm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SodaButton method, of class ZeroState.
     */
    @Test
    public void testSodaButton() {
        System.out.println("SodaButton");
        SodaMachine sm = new SodaMachine();
        ZeroState instance = new ZeroState();
        String expResult = "Deposit .50 cents first";
        String result = instance.SodaButton(sm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
