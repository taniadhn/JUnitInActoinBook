package com.dehghan;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.batch.BatchProperties;

import java.time.Duration;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class AssertionTimeoutTest {

     private  SUT syatemUnderTest = new SUT("System should be under test");

    @Test
    @DisplayName("A job is execuated within time")
    void tsetTimeout() throws InterruptedException{
        syatemUnderTest.addJob(new job("job 1"));
        assertTimeout(ofMillis(500), () ->syatemUnderTest.run(200));
    }

    @Test
    @DisplayName("A job is executed preemptively within a timeout")
    void testTimeoutPreemptively() throws InterruptedException {
        syatemUnderTest.addJob(new job("job 1"));
        assertTimeoutPreemptively(ofMillis(500),
                () -> syatemUnderTest.run(200));
    }
}
