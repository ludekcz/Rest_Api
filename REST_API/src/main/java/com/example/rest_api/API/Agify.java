package com.example.rest_api.API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Agify {
    String Name;
    int Age;
    int Count;



    public Agify() {}

        public Agify(String name, int age, int count) {
            Name = name;
            Age = age;
            Count = count;
        }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    @Override
    public String toString() { //výstup, který je tahaný na RestApiApplication
        return "Agify{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Count=" + Count +
                '}';
    }
}
