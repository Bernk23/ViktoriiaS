package com.svyrydova.hw18;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Box boxXml = Xml.xml("hw18xml.xml");
        System.out.println("xml :" + boxXml);
        Box boxJson = Json.json("hw18json.json");
        System.out.println("json :" + boxJson);
    }
}
