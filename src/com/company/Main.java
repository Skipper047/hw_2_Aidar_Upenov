package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Situation " + Situation(23.0,18.5));
        System.out.println(Walking(47,-9));
        System.out.println("Monday " + Walking(25,-2));
        System.out.println("Tuesday " + Walking(17,20));
        System.out.println("Wednesday " + Walking(4,-10));
        System.out.println("Thursday " + Walking(65, 6));
        System.out.println("Friday " + Walking(13,23));
    }
    public static double Situation(double AgePerson, double OutsideTemperature){
        return AgePerson + OutsideTemperature;

    }
    public static String Walking(int AgeMan, int OutSide){
        String YouCan = "Можно идти гулять";
        String StayAtHome = "Оставайтесь дома";
        String Result = "Результат";
        if (AgeMan > 20 && AgeMan < 45 && OutSide > -20 && OutSide <= 30){
            Result = YouCan; }
        else if (AgeMan < 20 && OutSide >= 0 && OutSide <= 28){
            Result = YouCan; }
        else if (AgeMan > 45 && OutSide >= -10 && OutSide <= 25)
        {
            Result = YouCan;
        }
        else System.out.println(StayAtHome);;
        return YouCan;

    }


}
