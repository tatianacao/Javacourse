public class Operators {
        public static void main(String[] args) {

            //arithmetic operators: +, -, *, /, %, ++, --
            System.out.println(3+6); //addition
            System.out.println(3-6); //subtraction
            System.out.println(3*6); //multiplication
            System.out.println(6/3); //division
            System.out.println(7/3); //whole number given
            System.out.println(7%3); //remainder
            int number = 3;
            System.out.println(++number); //incrementing by 1
            System.out.println(--number); //after being incremented, it became 4, doing -- means 3
            int number1 = 4;
            System.out.println(++number1); //incrementing by 1
            int number2 = 3;
            System  .out.println(--number2); //decrementing by 1

            //+ sign in String gives us concatenation
            String str1 ="Hello"; //can add a space here or add space in concatenation
            String str2 = "World";
            System.out.println(str1+" "+str2); //can add quotation marks for the space in between words
            System.out.println(str1+number1+number2);
            //this produces Hello world 52, it will not give 4 & 3. this is an ASCII value
            //this happens when you add numbers to string concatenations

            System.out.println(str1+number);

            //assignment operators =, +=, -=, *=, /=, %=
            int x;
            x= 5; //assigning 5
            x += 5; //x = x+5
            //this is saying you want to add 5 to the integer
            System.out.println(x);

            //comparison operators: ==, !=, >, <, >=, <=
            System.out.println(5==5); //equal to
            System.out.println(5 !=5); //not equal to
            System.out.println (5 > 5); // greater than
            System.out.println(5 < 5);// less than
            System.out.println(5 >= 5); // greater than or equal to
            System.out.println(5 <= 5); // less than or equal to

            //logical operators: &&, ||, !
            System.out.println(x>0 && x<15); //"and" the x here is 10; we assigned x= x+5 earlier
            System.out.println(x<0 || x<15); //or
            System.out.println(!(x<15)); //not
        }

    }

