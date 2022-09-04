package keywords.modifiers.nonaccess;

public class TestHuman {
    public static void main(String[] args) {
        //height: static variable
        //weight: nonstatic variable
        //smile: non static method
        //talk: static method
        Human john = new Human();
        //by using the object I can only access non-static methods
        //weight is a non-static object
        john.smile(); //--> non-static method belong to object
        //john.weight(); --> non-static variable belongs to object?? ...need to do getter and setter
        Human.talk(); //--> static (method)properties belong to the class
        //can access non-static methods w/ object name
        //can access static methods w/ class name
        //static methods belongs to the class
        //static properties belong to the class
        //non-static properties belong to object

        //NOW TO USE VARIABLES HEIGHT AND WEIGHT... use getter and setter
        Human Dave = new Human();
        Dave.setWeight(190);
        System.out.println(Dave.getWeight());

        Human sean = new Human();
        sean.setWeight(170);
        System.out.println(sean.getWeight());
        System.out.println(Dave.getWeight());

        //if you add static in front of int weight
        //now the weight belongs to the class, it is considered one value
        //since you are still in the Human class, the weight will be the same after reassignment

        Human jack = new Human();
        jack.setWeight(200);
        System.out.println("jack weight" +jack.getWeight());
        System.out.println("sean weight" +sean.getWeight());
        //if weight is a static variable it will be the same value
        //if weight is a non-static variable it will not be the same value, it will be what you assign it to be
    }
}
