package com.dehghan;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("Repository")
class CustomerREpositoryTest {

    private String CUSTOMER_NAME = "Parivash Dehghan";
    private CustomerREpository customerREpository = new CustomerREpository();

    @Test
    void testNonExistence(){
        boolean exists = customerREpository.contains("Parivash Dehghan");
        assertFalse(exists);
    }

    @Test
    void testCustomerPersistence(){

        customerREpository.persist(new Customer(CUSTOMER_NAME));

        assertTrue(customerREpository.contains("PARIVASH DEHGHAN"));
    }
}