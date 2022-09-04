package datatypes.nonprimitive;

public class Wrapper {

    public static void main(String[] args) {
/* Wrapper class: class that wraps a primitive variable in order to make
it in non-primitive (having option with it)*/
        byte b =23;
        Byte by = 123; //1 byte --> switch to non-primitive version of the byte (capital Byte)
        //this is converting the byte to a non-primitive by calling it Byte
        String newByte = by.toString();

        short s = 23;
        Short so = 34; //2 bytes

        int i = 7652;
        Integer x = 2; //4 bytes

        long l = 54;
        Long lo = 654L; //8 bytes
        lo.shortValue();
        //these have capital names bc it is class name
//capitalized, wrapper variable gives you access
//to some classes that the original variable did not have
        //fractions - decimals
        Float f = 1.34567F; //4 bytes
        Double d = 1.45; //8 bytes

        //characters
        Character c = '4'; //2 bytes

        //true or false
        Boolean bool = false; //1 bit (1/8 byte)

    }
}
