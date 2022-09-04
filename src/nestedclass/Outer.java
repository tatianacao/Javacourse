package nestedclass;

public class Outer {
    //starting of the outer class
    //outer variable
    int outerVar = 5;
    Inner inner = new Inner ();

    Outer(){
        //outer constructor
    }
    public void outerMethod(){
        System.out.println("this is outer method");
    }

    //nested class is a class within a class
    public class Inner{
        //starting of inner class
        //outer variable
        int innerVar = 5;

        Inner(){
            //outer constructor
        }
        public void innerMethod(){
            System.out.println("this is inner method");
        }
    }//end of inner class
}
