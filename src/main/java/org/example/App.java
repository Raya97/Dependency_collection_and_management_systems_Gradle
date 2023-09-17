package org.example;

import com.google.gson.JsonObject;

public class App {
    public static void main(String[] args) {
        JsonObject json = new JsonObject();
        json.addProperty("name", "Raisa");
        json.addProperty("lastName", "Vlasenko");
        System.out.println(json);

    }
}
