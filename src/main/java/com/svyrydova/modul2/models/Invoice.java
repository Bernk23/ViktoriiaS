package com.svyrydova.modul2.models;

import java.util.ArrayList;

import com.svyrydova.modul2.service.ShopService;
import lombok.Data;

@Data
public class Invoice {
    private final ArrayList<Sale> sales = ShopService.readCsv("saleList.csv");
    private String type;
}