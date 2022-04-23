package com.company;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, String fullName, int nobility, int honor, int courage) {
        super(name, fullName);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }
    public static void studentСomparison(Gryffindor[] gryffindors){
        int rezult;
        String name = gryffindors[0].getName();
        int max;
        for (int i = 0; i < gryffindors.length; i++) {
            rezult = gryffindors[i].courage + gryffindors[i].honor + gryffindors[i].nobility;
            max = gryffindors[0].courage + gryffindors[0].honor + gryffindors[0].nobility;
            if (rezult > max){
               name = gryffindors[i].getName();
            }
        }
        System.out.println("Лучший студент - " +  name);
    }

}