/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof_observer_structure;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author prathamesh
 */
public class SubjectTest {
            static Subject instance2 = new Subject();
            
            static Observer o = new Observer1("Dr. Oofdoom");
            
            static Subject instance = new Subject();

            Observer o1 = new Observer2("Mrs. Hurricane");
    
    public SubjectTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("***Setting up Class Subject");
    instance2.attach(o);
    instance2.setState(41, 7);
    }
    
    /**
     * Test of attach method, of class Subject.
     */
    @Test
    public void testAttach() {

        boolean expResult = true;
        System.out.println("***Testing Attach");
        boolean result = instance.attach(o1);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of detach method, of class Subject.
     */
    @Test
    public void testDetach() {
        System.out.println("***Testing  detach");
        Observer o2 = new Observer1("Mr. Muffuletta");
        instance.attach(o2);
        Observer expResult = o2;
        Observer result = instance.detach(o2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Notify method, of class Subject.
     */
    @Test
    public void testNotify() {
        System.out.println("***Testing  Notify");
        instance2.setState(41, 7);
        //instance2.Notify();

        instance.setState(41, 7);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setState method, of class Subject.
     */
    @Test
    public void testSetState() {
        System.out.println("***Testing setState");
        int x = 0;
        int y = 0;
        instance2.setState(0, 0);
        instance.setState(0, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
