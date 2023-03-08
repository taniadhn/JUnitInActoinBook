package com.dehghan;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NestedTest {

    private static final String FIRST_NAME = "TAnia";
    private static final String LAST_NAME = "DEHGHAN";

    @Nested
    class BuilderTest{
        private String MIDDLE_NAME = "PARIVASH";

       /** @Test
        void customerBuilder() throws ParseException{

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");
            Date  customerDate = simpleDateFormat.parse("04-21-2020");
            com.dehghan.Nested.Customer customer = new com.dehghan.Nested.Customer.Builder(
                    FIRST_NAME,LAST_NAME).withMiddleName("PARIVASH").withBecomeCustomer(customerDate).built();

            assertAll(() -> {
                assertEquals(FIRST_NAME, customer.getFirstName());
                assertEquals(LAST_NAME, customer.getLastName());
                assertEquals(MIDDLE_NAME, customer.getMiddleName());
                assertEquals(customerDate, customer.getBecomeCustomer());
            });
        }**/
    }


}