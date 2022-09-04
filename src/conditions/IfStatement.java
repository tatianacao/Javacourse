package conditions;

public class IfStatement {

    public static void main(String[] args) {
        //if(condition){work}
        //if(condition){work} else {remaining option}
        //if(condition){work} else if (condition){work}..
        //if(condition){work} else if (condition){work}...else {remaining options}
        // if --> result1
        //if (condition){result of condition}
        int number1 = 0;
        if (number1 == 0) {
            System.out.println("if statement");
            System.out.println("the number is null");
        }
        int number2 = 5;
        //if (condition){result1} else {result2}
        if (number2 > 0) {
            System.out.println("if else statement");
            System.out.println("the number is positive");
        } else {
            System.out.println("the number is negative");
        }
        int number3 = 0;
        //if (condition1_{result1} else if(conditions2{result2} .. else (result n)
        if (number3 > 0) {
            System.out.println("if else if ... else statement");
            System.out.println("the number is positive");
        } else if (number3 < 0) {
            System.out.println("if else if ... else statement");
            System.out.println("the number is negative");
        } else {
            System.out.println("if else if ... else statement");
            System.out.println("the number is null");
        }

        //nested condition: is a condition inside a condition
        int age = 20;
        String gender = "F";

        if (age > 18) {
            if (gender == "F") {
                System.out.println("this lady is an adult");
            } else if (gender =="M") {
                System.out.println("this guy is an adult");
            }
        }else {
            if(gender == "F"){
                System.out.println("this lady is a minor");
            }else if (gender == "M"){
                System.out.println("this guy is a minor");
            }
        }
    }
}
