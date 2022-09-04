package classobjectconstructor;

public class House {
//VARIABLES
        String houseName;
        String houseColor = "white";
        int houseAddress;

        //local variable belongs to a specific block of code, the constructor
        //constructor: accessModifier ClassName(parameters){body}/
        // block of code similar to method
        // has no type of method
        //implicitly called when the object is created
        public House(String myHouseName, int myHouseAddress){
            houseName = myHouseName;
            houseAddress = myHouseAddress;
            System.out.println(houseColor);
            System.out.println(houseAddress);
            System.out.println(houseName);
            System.out.println(myHouseName);



//default constructor: accessModifier ClassName ( parameters) {body}
        }

//METHODS
        //method is a reusable piece of code that is used when called
        public void bedRoom(){
            System.out.println("sleep zzz");
        }
        public void bathRoom(){
            System.out.println("shower lalala");
        }
        public void kitchen(){
            System.out.println("eat yummy");
        }
        public void livingRoom(){
            System.out.println("watch TV");
        }
    }
//we are creating a blueprint
//in main method, we are only going to call the method that you need
