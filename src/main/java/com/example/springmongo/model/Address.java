package com.example.springmongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Address {
    @Id
    public String id;

    public String street;
    public String city;
    public String state;

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, street='%s', city='%s', state='%s']",
                id, street, city, state);
    }
}
