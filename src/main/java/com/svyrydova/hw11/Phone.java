package com.svyrydova.hw11;

import javax.swing.*;
import java.util.Objects;

public abstract class Phone implements PhoneMenu {
    public Phone() {

    }

    abstract String call();

    abstract String sms();

    protected String phone;
    protected Variety variety;
    protected Variety2 variety2;
    protected String[] phoneArray;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return variety == phone.variety && variety2 == phone.variety2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(variety, variety2);
    }

    public Phone(Variety variety, Variety2 variety2) {
        this.variety = variety;
        this.variety2 = variety2;


    }
}

