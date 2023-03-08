package com.dehghan;

import org.assertj.core.util.VisibleForTesting;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertAllTest {

    @Test
    @DisplayName("SUT should default to not being under current verification")
    void systemTestNotVerified(){

        SUT systemUnderTest = new SUT("our system under test");

        assertAll("By default, SUT is not under current verification" ,
                () ->   assertEquals("our system under test", systemUnderTest.getSystemName()),
                () -> assertFalse(systemUnderTest.isVerified())
        );

        /**System with some assertion method with message**/
        /**
         * assertFalse(systemUnderTest.isVerified(),
         * () -> "System should not be under verification.");
         * */
    }

    @Test
    @DisplayName("SUT should be under current verification")
    void systemTestVerification(){

        SUT systemUnderTest = new SUT("our system under test");
        systemUnderTest.verify();

        assertAll("By default, SUT is under current verification",
                () -> assertEquals("our system under test", systemUnderTest.getSystemName()),
                ()-> assertFalse(systemUnderTest.isVerified())

                );

        /**ASSERT METHOD WİTH MESSAGE*/
        /**
         * systemUnderTest.verify();
         * assertFalse(systemUnderTest.isverified(),
         *             () -> "System should be under Test");
         * */


    }

    @Test
    @DisplayName("SUT should have no current job")
    void testNoJob() {

        SUT systemUnderTest = new SUT("System no current job");
        assertNull(systemUnderTest.getCurrentJob(""),
                () -> "There should be no current job");

    }

}