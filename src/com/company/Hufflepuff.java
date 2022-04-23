package com.company;

public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, String fullName, int hardworking, int loyal, int honest) {
        super(name, fullName);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }
    public static void studentСomparison(Hufflepuff[] hufflepuffs){
        int rezult;
        String name;
        int max;
        for (int i = 0; i < hufflepuffs.length; i++) {
            rezult = hufflepuffs[i].hardworking + hufflepuffs[i].loyal + hufflepuffs[i].honest;
            max = hufflepuffs[0].hardworking + hufflepuffs[0].loyal + hufflepuffs[0].honest;
            if (rezult > max){
                name = hufflepuffs[i].getName();
                System.out.println("Лучший студент - " +  name);
                break;
            }
            else {
                name = hufflepuffs[0].getName();
                System.out.println("Лучший студент - " +  name);
                break;
            }
        }
    }
}
