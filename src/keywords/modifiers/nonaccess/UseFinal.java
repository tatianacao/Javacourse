package keywords.modifiers.nonaccess;

final public class UseFinal {
    //final in class: can not be inherited
    public static void main(String[] args) {
        //final keyword is applicable for class and properties
        //assigned value to age
        int age = 20;
        System.out.println(age);

        //reassign value to age
        age = 30;
        System.out.println(age);

        //final in variables: cannot reassign a value for a final variable
        final int number =6;
        System.out.println(number);
        //we cannot reassign a value for a final variable
    }
    //final in method: method cannot be overridden
    final public void myMethod(){
        System.out.println("test");
        //the method can not be overridden
    }
}
