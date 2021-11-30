package com.svyrydova.hw11;

import java.util.Objects;

public abstract class Phone implements PhoneMenu {
    protected Colour colour;
    protected Year year;

    public Phone(Colour colour, Year year) {
        this.colour = colour;
        this.year = year;
    }

    abstract public String call();

    abstract public String sms();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return colour == phone.colour && year == phone.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, year);
    }
}

