package com.teedjay;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTestResource(DummyTestResource.class)
@QuarkusTest
public class DummyTestResourceTest {

    @Test
    public void dummyTest() {
        String value = System.getProperty("secretPropertyKey");
        assertEquals("secretValue", value);
    }

}
