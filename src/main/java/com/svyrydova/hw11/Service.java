package com.svyrydova.hw11;

public class Service {


    public String foundError(Phone phone) {
        if (phone.call() == null) {
            return "Ring error";
        }
        if (phone.sms() == null) {
            return "Sms error";
        } else {
            return "All is ok";
        }
    }

    public void giveMethod(Phone phone) {
        if (phone instanceof Smartphone) {
            Smartphone smartphone = (Smartphone) phone;
            smartphone.flashlight();
        }
        if (phone instanceof RotaryPhone) {
            RotaryPhone rotaryPhone = (RotaryPhone) phone;
            rotaryPhone.circle();
        }
        if (phone instanceof CellularPhone) {
            CellularPhone cellularPhone = (CellularPhone) phone;
            cellularPhone.calendary();
        }
    }

    public void testPhone(Phone phone) {

        String result = foundError(phone);

        if (result.equals("Ring error") || result.equals("Sms error")) {
            phone.app();
            phone.menu();
            phone.call();
            phone.sms();
            giveMethod(phone);
        } else {
            System.out.println("All is ok");
        }
    }
}