package keywords.modifiers.access;

public class Source {
    //public gives property access from anywhere in the project (outside the package)
    public String apartmentNum = "b";
    //the variable apartmentNum can be accessible everywhere in the project

    //private gives property access in the class only
    private int myAge = 25;
    //I cannot access the variable my age outside the class bc it is private

    //default gives property access only in package
    String phoneNumber = "347 678 3452";
    //whenever there is no keyword behind the condition (String), it is public by default

    //protected property will be addressed in subclass chapter

    public static class AccessModifiers {
            //public gives property access from anywhere in the project (outside the package)
            public static void main(String[] args){

                //create object of source class, can access public variable
                Source mySource = new Source();
                System.out.println(mySource.apartmentNum); //public property
                System.out.println(mySource.phoneNumber); //default property
            }
            //protected gives property access in subclass(subclass chapter)
            protected int number = 7;
            //able to be used in a subclass

            //private gives property access in the class only
            private int myAge = 25;

            //default gives property access only in package
            String phoneNumber = "3479893489";
        }
}


