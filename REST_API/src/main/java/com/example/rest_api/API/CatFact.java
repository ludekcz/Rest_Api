package com.example.rest_api.API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatFact {
    String fact;
    String reverse;
    int UnitTest;
    int length;



    public CatFact() {
    }

        public String getFact() {
            return fact;
        }
        public void setFact(String fact) { //obraceny text, kde se odebírá délka z fact.length začíná např na 82 a jede až na 0 a během toho zapisujeme pro každou iteraci písmeno do reverse.
            this.fact = fact;
            for(int i = fact.length() - 1; i >= 0; i--)
            {
                reverse = reverse + fact.charAt(i);
            }

        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
           this.length = length;

            if (fact.length() == length) //Unit test kontrola délky parametru fact zda odpovídá parametru count
            {
                UnitTest = length;
            }
            else
            {
                UnitTest = 0;
            }
        }



    @GetMapping("/fakt") //localhost:8080/fakt
    @Override
    public String toString() { //Výstup rest API faktů o kočkách s maximální délkou 100
        return "CatFact{" +
                "fact='" + fact + '\'' +
                "||| Obraceny fakt ||| = '" + reverse + '\'' +
                "||| UNIT TEST? ||| = '" + UnitTest + '\'' +
                ", length=" + length +
                '}';
    }

}