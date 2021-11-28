package com.svyrydova.hw11;

import java.util.Objects;

public class Main {
  public static void main(String[] args) {


    RotaryPhone rotaryPhone = new RotaryPhone(Variety.RED, Variety2.Y1989);
    CellularPhone cellularPhone = new CellularPhone(Variety.RED, Variety2.Y1989);
    Smartphone smartphone = new Smartphone(Variety.RED, Variety2.Y1989);
    Service service = new Service();
    service.testPhone(rotaryPhone);
    service.testPhone(cellularPhone);
    service.testPhone(smartphone);

  }
}



