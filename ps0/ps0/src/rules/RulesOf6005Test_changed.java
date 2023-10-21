/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package rules;

import static org.junit.Assert.*;

import org.junit.Test;

public class RulesOf6005Test {
    
    /**
     * Tests the mayUseCodeInAssignment method with additional test cases.
     */
    @Test
    public void testMayUseCodeInAssignment() {
        // Test 1: You cannot use publicly available code even if it's cited.
        assertFalse("Expected false: publicly available code, cited",
                RulesOf6005.mayUseCodeInAssignment(false, true, false, true, false));
        
        // Test 2: You cannot use code that is not written as part of 6.005 course work.
        assertFalse("Expected false: code not written as course work",
                RulesOf6005.mayUseCodeInAssignment(false, false, false, true, true));
        
        // Test 3: You can use self-written code even if it's available to others.
        assertTrue("Expected true: self-written code, available to others",
                RulesOf6005.mayUseCodeInAssignment(true, true, true, true, true));
        
        // Test 4: You can use code that is required for the assignment.
        assertTrue("Expected true: code required for the assignment",
                RulesOf6005.mayUseCodeInAssignment(false, false, true, true, true));
    }
}