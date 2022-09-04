package loops;

public class Loops {

        public static void main(String[] args) {
//loop = iteration/ you can have multiple iterations in one loop

//WHILE LOOP
            //    int i = 0;
            //loops are a set of conditions
            //    while(i<20){
            //    System.out.println(i+" turn around the house");
            //    i++;}



//DO WHILE LOOP
        //     int x = 30;
        //     do {
        //    System.out.println(x);
        //    x++;
        //     }while (x < 20);
        //this will also print the same as the first loop (if x < 20)  -->

//QUESTION
        //what is the difference between while and do while loop?
        //while loop first checks the condition and then executes the block
        //do while executes the block, then checks the condition (will print first bc the condition to check comes after)

//QUESTION
        //while loop vs for loop?
        //in for loop, condition is written all in one line

//FOR LOOP
        int[] array = {2, 9, 7, 5, 6, 8};
        //System.out.println(array[0]);
        //System.out.println(array[1]);
        //System.out.println(array[2]);
        //System.out.println(array[3]);

    for(int i = 0; i <20; i++){
            System.out.println(i);
        }

    for(int i=0; i<4; i++){
            System.out.println(array[i]);
        }

        //MY CONFUSION: WHAT DOES I< HAVE TO DO IN RELATION TO THE ARAY LENGTH?

//QUESTION
        //how can you print this ^^^^ 1000 times if you don't want to write it out that much?

    for (int i = 0; i< array.length; i++){
            System.out.println(array[i]);
            //you can do this if you don't want to count how many numbers there are
        }

//FOR EACH LOOP
        //inside the for loop you have to create an integer, like temp
        //then you have to mention the array that you want to read

        //    for(int temp: array){
        //        System.out.println(temp);
        //        //with this you don't need to put array.length
        //        //create an empty variable
        // }
//QUESTION?
        //What if you only want to print the first 50 integers in a set of 10000? use break keyword

//VVVVV ALSO FOUND IN KEYWORDS/ BREAKCONTINUE
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
}}
