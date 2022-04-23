package com.company;

public class Main {

    public static void main(String[] args) {

    Gryffindor [] gryffindors = {
     new Gryffindor("Garry", "Potter", 333, 33, 33),
     new Gryffindor("Hermione", "Granger", 22333, 33, 22),
     new Gryffindor("Ron", "Weasley", 22, 3, 3),
};
    Gryffindor.studentСomparison(gryffindors);
    System.out.println();
    Slytherin [] slytherins = {
    new Slytherin("Draco", "Malfoy", 2, 22, 22, 22, 1),
    new Slytherin("Graham", "Montague", 4,22,44,1,2),
    new Slytherin("Gregory", "Goyle", 5,2,55,2,22),
    };
        Slytherin.studentСomparison(slytherins);
        System.out.println();
    Hufflepuff [] hufflepuffs = {
    new Hufflepuff("Zacharias", "Smith", 22,1,5),
    new Hufflepuff("Cedric", "Diggory", 7,5,4 ),
    new Hufflepuff("Justin", "Finch-Fletchley", 9, 33, 44),
    };
    Ravenclaw [] ravenclaws = {
    new Ravenclaw("Zhou", "Chang", 88,2,43,44),
    new Ravenclaw("Padma", "Patil", 66,7,3,5),
    new Ravenclaw("Marcus", "Belby", 4,65, 33,1),
    };
    PrintService printService = new PrintService();
    printService.print(gryffindors);
    System.out.println();
    printService.print(slytherins);
    System.out.println();
    printService.print(ravenclaws);
    System.out.println();
    printService.print(hufflepuffs);

}

}

