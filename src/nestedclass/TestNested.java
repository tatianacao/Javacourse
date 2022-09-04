package nestedclass;

public class TestNested {
    public static void main(String[] args) {
        Outer outer = new Outer ();
        outer.outerMethod();
        //how can we access the inner properties?
        //you need to create an object in the main class
        // --> Inner inner = new Inner
        outer.inner.innerMethod();
        //in order to have properties of inner class you need to have object of the inner class created in the main class

    }
}
