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
public class SodaMachineTest {
    SodaState current;
    
    public SodaMachineTest() {
    }

    /**
     * Test of CoinReturn method, of class SodaMachine.
     */
    @Test
    public void testCoinReturn() {
        System.out.println("SetCurrent to FiftyState\n" +
"SodaButton-ZeroState\n" +
"SodaButton-TwentyfiveState\n" +
"SodaButton-FiftyState\n" +
"CoinSlotDeposit-ZeroState\n" +
"CoinSlotDeposit-TwentyfiveState\n" +
"CoinSlotDeposit-FiftyState\n" +
"CoinReturn-ZeroState\n" +
"CoinReturn-TwentyfiveState\n" +
"CoinReturn-FiftyState");
        SodaMachine instance = new SodaMachine();
        String expResult = instance.CoinReturn();
        String result = instance.CoinReturn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of CoinSlotDeposit method, of class SodaMachine.
     */
    @Test
    public void testCoinSlotDeposit() {
        //System.out.println("CoinSlotDeposit");
        SodaMachine instance = new SodaMachine();
        String expResult = "Total entered: $0.25";
        String result = instance.CoinSlotDeposit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of SodaButton method, of class SodaMachine.
     */
    @Test
    public void testSodaButton() {
        //System.out.println("SodaButton");
        SodaMachine instance = new SodaMachine();
        String expResult = instance.SodaButton();
        String result = instance.SodaButton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SetCurrent method, of class SodaMachine.
     */
    @Test
    public void testSetCurrent() {
        //System.out.println("SetCurrent");
        SodaState s = null;
        SodaMachine instance = new SodaMachine();
        instance.SetCurrent(s);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
