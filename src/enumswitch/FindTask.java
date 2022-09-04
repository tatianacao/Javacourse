package enumswitch;

public class FindTask {
        public static void main(String[]args){
            Day object = new Day();
            //object.whichDay("fri");
            //object.whichDay("whatever;"); --> default answer "invalid day"
            //THIS IS BEFORE ENUM KEYWORD ^^^
            //anything other than case will be invalid
            //this will print all tasks from friday up until invalid
            //this works like loop
            //hence, put break statement after every case
            System.out.println(Week.MON);
            //now I can independently call upon which day i want to print
            object.whichDay(Week.MON);
        }
    }

//public class FindTask {
    //  public static void main(String[]);
//}

