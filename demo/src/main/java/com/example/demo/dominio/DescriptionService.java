package com.example.demo.dominio;

import org.apache.commons.lang3.Validate;

public class DescriptionService {

    private final String value;

    public DescriptionService(String value) {
        Validate.notNull(value, "Description can not be null.");
        Validate.isTrue(value.trim().length() < 512, "description service can not be longer than 512 character");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
