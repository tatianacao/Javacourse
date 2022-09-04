package classobjectconstructor;

public class TestHouse {

    public static void main(String[] args) {

        //constructor is a block of code similar to method, implicitly called
        //during the creation of the object
        House myHouse = new House("melenium", 5463);

        House obama = new House("greenfield", 924);
        System.out.println(obama.houseColor);
        System.out.println(obama.houseAddress);
        obama.kitchen();
        myHouse.bathRoom();
        myHouse.bedRoom();
        myHouse.livingRoom();
        myHouse.kitchen();
        System.out.println(myHouse.houseColor);
        System.out.println(myHouse.houseName);
        System.out.println(obama.houseAddress);
        //House yourHouse = new House ("Eliza", 763);
        //we can have two constructors
    }
}
