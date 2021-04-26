package com.company;

public class Main {

    public static String ageTemperature(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static void main(String[] args) {
        System.out.println(ageTemperature(14, 22));
        System.out.println(ageTemperature(10, 79));
        System.out.println(ageTemperature(7, 28));
        System.out.println(ageTemperature(97, 67));
        System.out.println(ageTemperature(23, 87));
    }
}
