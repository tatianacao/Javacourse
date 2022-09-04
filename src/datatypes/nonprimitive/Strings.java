package datatypes.nonprimitive;

public class Strings {
    public static void main(String[] args) {
        //string concatenation: add two strings (or integers, anything)
        String str1 = "Hello";
        String str2 = "World";
        int number = 10;
        System.out.println(str1+" + "+str2); //output:  Hello World
        System.out.println(str1+number); //output: Hello10

        //string manipulation
        String str = "Hello World Welcome Java";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.indexOf("W")); //position of W is 6 bc java starts counting from 0

        System.out.println(str1.concat(str1));
        //this is another way of writing: "str1+" "+str2

        String[] words = str.split(" "); //how do you know its splited? the result of this is an array
        System.out.println("word1: "+words[0]);
        System.out.println("word2: "+words[1]);
        System.out.println("word3: "+words[2]);
        System.out.println("word4: "+words[3]);

        System.out.println(str.replace(" ", "++"));
        // System.out.println(str1+str2) = System.out.println(str1.concat(str2));
        System.out.println(str1.concat(str2));
        System.out.println(str1+str2);

        //escape characters
        System.out.print("\"anything\""); // \ means escape double quote; considering this as a normal quotation, not java quotation
        System.out.println("\""); //escape single quote
        System.out.println("\\");

        System.out.println("word1");
        System.out.println("word2"); //ln will say to go to its own line
        System.out.print("word1 \n"); //another way to say go to new line, bc the ln isn't there
        System.out.println("\t word1"); //tab space before character
        System.out.print("word2");

        //PRACTICE:
        System.out.println("\"today is an ambiguous month\""); //adds quotation marks
        System.out.println("\\YOU will get an IT job and be able to do nursing part time! yes.");
        System.out.println("whatever you say\""); // just to add a single quotation mark
    }}
//non-primitive variables can be manipulated (string can be put lower or uppercase, etc)