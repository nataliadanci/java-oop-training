package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonTester {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"Mahesh\", \"age\":21, \"grade\":10, \"cnp\":\"1122334455\"}";

        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create();
        //creates the object Student from the jsonString
        Student student = gson.fromJson(jsonString, Student.class);
        System.out.println(student);

        //creates the jsonString from the object Student
        jsonString = gson.toJson(student);
        System.out.println(jsonString);
    }
}
