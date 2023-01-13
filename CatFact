package com.example.rest_api.API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatFact {
    String fact;
    int length;



    public CatFact() {
    }

        public String getFact() {
            return fact;
        }

        public void setFact(String fact) {
            this.fact = fact;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
           this.length = length;
        }

    @Override
    public String toString() { //Výstup rest API faktů o kočkách s maximální délkou 100
        return "CatFact{" +
                "fact='" + fact + '\'' +
                ", length=" + length +
                '}';
    }
    @GetMapping("/fakty") // První kroky pouze zda funguje java + verze .jdks neslo mi to chvilku srovnat.
    public String greetMessage(){
        return "fact = " + this.fact;
    }
}
