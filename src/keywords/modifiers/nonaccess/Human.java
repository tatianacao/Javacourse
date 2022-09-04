package keywords.modifiers.nonaccess;

public class Human {
    static int height;
    int weight;

    public static int getHeight() {
        return height;
    }

    public static void setHeight(int height) {
        Human.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void smile (){
        height = 6;
        weight = 170;
        System.out.println("nice teeth");
        //in this non-static method we are able to use static and non-static variables
    }
    //static method: only use static variables
    public static void talk (){
        height = 6;
        //weight = 170;
        System.out.println("people speak");
    }
}
