package com.company;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private  int ambition;
    private int resourcefulness;
    private int  lustForPower;

    public Slytherin(String name, String fullName, int cunning, int determination,
                     int ambition, int resourcefulness, int lustForPower) {
        super(name, fullName);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }
    public static void studentСomparison(Slytherin[] slytherins){
        int rezult;
        String name;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < slytherins.length; i++) {
            rezult = slytherins[i].cunning + slytherins[i].determination + slytherins[i].ambition +
                    slytherins[i].resourcefulness + slytherins[i].lustForPower;
            max = slytherins[0].cunning + slytherins[0].determination + slytherins[0].ambition +
                    slytherins[0].resourcefulness + slytherins[0].lustForPower;
            if (rezult > max){
                name = slytherins[i].getName();
                System.out.println("Лучший студент - " +  name);
                break;
            }
            else {
                name = slytherins[0].getName();
                System.out.println("Лучший студент - " +  name);
                break;
            }
        }
    }
}
