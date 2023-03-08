package com.dehghan;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AssertThrowsTest {

    private SUT systemUnderTest = new SUT("system under Test");

    @Test
    @DisplayName("An exception is expected")
    void testExeptedException(){

       // assertThrows(NoJobEXception.class, systemUnderTest::run );
    }

    @Test
    @DisplayName("An exception is caught")
    void testCatchException() {
       /// Throwable throwable = assertThrows(NoJobException.class,
         //       () -> systemUnderTest.run(1000));
      //  assertEquals("No jobs on the execution list!",
              //  throwable.getMessage());
    }

}
