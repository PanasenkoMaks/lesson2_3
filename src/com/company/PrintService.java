package com.company;

public class PrintService {
    public void print(Gryffindor [] gryffindors){
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("name - " + gryffindor.getName() + " " + "fullName - " + gryffindor.getFullName() + " courage "
                    + gryffindor.getCourage() + " nobility " + gryffindor.getNobility() + " honor " + gryffindor.getHonor());
        }
        }
    public void print(Hufflepuff [] hufflepuffs){
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("name - " + hufflepuff.getName() + " " + "fullName - " + hufflepuff.getFullName() + " hardworking "
                    + hufflepuff.getHardworking() + " loyal " + hufflepuff.getLoyal() + " honest " + hufflepuff.getHonest());
        }
    }
    public void print(Ravenclaw [] ravenclaws){
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("name - " + ravenclaw.getName() + " " + "fullName - " + ravenclaw.getFullName() + " smart "
                    + ravenclaw.getSmart() + " wise " + ravenclaw.getWise() + " witty " + ravenclaw.getWitty() +
                    " creativity " + ravenclaw.getCreativity());
        }
    }
    public void print(Slytherin [] slytherins){
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("name - " + slytherin.getName() + " " + "fullName - " + slytherin.getFullName() + " cunning "
                    + slytherin.getCunning() + " determination " + slytherin.getDetermination() + " ambition " + slytherin.getAmbition() +
                    " resourcefulness " + slytherin.getResourcefulness() + " lustForPower " + slytherin.getLustForPower());
        }
    }
    }