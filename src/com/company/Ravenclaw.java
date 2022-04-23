package com.company;

public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, String fullName, int smart, int wise, int witty, int creativity) {
        super(name, fullName);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public static void studentСomparison(Ravenclaw[] ravenclaws) {
        int rezult;
        String name = ravenclaws[0].getName();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ravenclaws.length; i++) {
            rezult = ravenclaws[i].smart + ravenclaws[i].wise + ravenclaws[i].witty + ravenclaws[i].creativity;
            max = ravenclaws[0].smart + ravenclaws[0].wise + ravenclaws[0].witty + ravenclaws[0].creativity;
            if (rezult > max) {
                name = ravenclaws[i].getName();
            }
            System.out.println("Лучший студент - " + name);
        }
    }
}

