package com.svyrydova.modul2.service;

import com.svyrydova.modul2.models.Customer;

import java.util.Random;

public class PersonService {
    private static final Random random = new Random();

    public Customer randomCustomer() {
        return new Customer(random.nextInt(100000000),
                random.nextInt(5676655) + "@gmail.com",
                random.nextInt(100));
    }
}
