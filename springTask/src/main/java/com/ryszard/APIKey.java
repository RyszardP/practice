package com.ryszard;

public class APIKey {

    private final String value;


    public APIKey(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof APIKey)) return false;

        APIKey apiKey = (APIKey) o;

        return value != null ? value.equals(apiKey.value) : apiKey.value == null;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}
