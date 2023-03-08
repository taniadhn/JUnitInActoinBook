package com.dehghan;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * all methods were disable in this class
 * */
@Disabled
class CalculatorTest {

    private static ResourceForAllTest resourceForAllTest;
    private SUT systemUnderTest;

    /**execute before all tests
     * this method needs to be static unless
     * the class annotated with @TESTINSTANCE
     * */
    @BeforeAll
    static void setUpClass(){
        resourceForAllTest
                = new ResourceForAllTest("our resource for all test");
    }

    /**
     * is executed before each test
     * */
    @BeforeEach
     void setUp(){
        systemUnderTest
                = new SUT("our system under test");
    }

    /***
     * are executed independently
     * */
    @Test
    @Disabled("WE can recovery this code and we need it")
    void sum() {
        Calculator calculator = new Calculator();
        double result = calculator.sum(10,50);
        assertEquals(60, result,0);
    }

    @Test
    void testRegularWork(){
        boolean canReceiveRegularWork
                = systemUnderTest.canReceiveRegularWork();
        assertTrue(canReceiveRegularWork);
    }

    @Test
    void testAdditionalWork(){
        boolean canReceiveAdditionalWork
                = systemUnderTest.canReceiveAdditionalWork();
        assertFalse(canReceiveAdditionalWork);
    }
    @AfterAll
    static void tearDownClass(){
        resourceForAllTest.close();
    }

    @AfterEach
    void tearDown(){
        systemUnderTest.close();
    }
}