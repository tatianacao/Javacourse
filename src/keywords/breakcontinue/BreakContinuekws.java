package keywords.breakcontinue;

public class BreakContinuekws {
    public static void main(String[] args) {
//break keyword: stops the loop at the given condition
        //for (int z = 0; z < 1000; z++){
        //    if(z == 50){
        //        break;
        //    }
        //    System.out.println(z);
        //output: stop once i = 50


//continue keyboard: stop the loop at a given condition then resumes
        for(int i = 0; i< 10; i++){
            if (i>4 && i<8){
                continue;
            }
            System.out.println(i);
        }
    }

}


