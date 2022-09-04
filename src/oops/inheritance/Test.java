package oops.inheritance;

public class Test {
    public static void main(String[] args) {
        Father john = new Father();
        john.height();
        john.communicate();
        john.education();
        //father originally has education
        //extends to Grandfather, which has height
        //Grandfather extends to Animal, which has communicate
        //MULTI-LEVEL INHERITANCE

        Son dave = new Son();
        dave.education();
        dave.height();
        dave.communicate();

        //Son extends to Father (education)
        //Father extends to Grandfather (height)
        //Grandfather extends to Animal (communicate)
        //MULTI-LEVEL INHERITANCE

        Animal Puchi = new Animal();
        Puchi.communicate();

        Mother Zoila = new Mother();
        Zoila.rich();
    }

        }
