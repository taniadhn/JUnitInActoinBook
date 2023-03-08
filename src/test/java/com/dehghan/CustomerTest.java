package com.dehghan;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("Individual")
class CustomerTest {

    private String CUSTOMER_NAME = "PARIVASH DEHGHAN";

    @Test
    void testCustomer(){

        Customer customer = new Customer(CUSTOMER_NAME);
        assertEquals("PARIVASH DEHGHAN", customer.getName());
    }

}