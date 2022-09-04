package enumswitch;

public class Day {
    public void whichDay(Week day ) {
        switch (day) {
            case MON:
                System.out.println("review recordings");
                break;
            case TUES:
                System.out.println("practice");
                break;
            case WED:
                System.out.println("homework");
                break;
            case THU:
                System.out.println("rest");
                break;
            case FRI:
                System.out.println("assignment");
                break;
            case SAT:
                System.out.println("attend course 1");
                break;
            case SUN:
                System.out.println("attend course 2");
                break;
            default:
                System.out.println("invalid day");
                //find a way to limit the choices of the user
                //make an enum class and state the variables now

        }
    }
}


