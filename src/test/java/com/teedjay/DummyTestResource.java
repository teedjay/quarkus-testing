package com.teedjay;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;

import java.util.Map;

public class DummyTestResource implements QuarkusTestResourceLifecycleManager {

    @Override
    public Map<String, String> start() {
        System.out.println("I'm starting DummyTestResource and returning one system property");
        return Map.of("secretPropertyKey", "secretValue");
    }

    @Override
    public void stop() {
        System.out.println("I'm stopping DummyTestResource, c u l8r");
    }

    @Override
    public void inject(Object testInstance) {
        System.out.printf("This is where you can inject stuff into : %s%n", testInstance.getClass().getName());
    }

}
