package com.elvira.customer;

public record CustomerRegistrationRequest(
        String name,
        String email,
        Integer age) {

}
