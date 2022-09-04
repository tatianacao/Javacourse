package datatypes.nonprimitive;

public class Array {
    public static void main(String[] args) {
        //array is a variable that can hold multiple values: arrayType [] arrayName = {value1, value2, value3};
        //syntax1: variableType [] arrayName = {value1, value2, value3}
        //in line declaration and assignment
        int[] array1 = {2, 9, 7, 5};
        System.out.println(array1[3]);
//OR syntax2: declare array
        int[] array2 = new int[2];
        array2[0] = 4;
        array2[1] = 3;
        //index is what position is the value in


        //variableType [] arrayName = new variableType [array length]
        //now, how do we assign the array value?
        //could be broken down in 2: declaration and then assignment
        //declare array the num. in the bracket  is how many  numbers it holds
        String[] array3 = new String[5];
        //assign array value: arrayName[index] = value
        array3[0] = "john";
        array3[1] = "josh";
        array3[2] = "dave";
        array3[3] = "sean";
        array3[4] = "brad";

        System.out.println(array3[4]);

        //multiple dimension array (2D array)
        //has two square brackets
        char[][] array4 = new char[2][2];
        array4[0][0] = 'a';
        array4[0][1] = 'b';
        array4[1][0] = 'c';
        array4[1][1] = 'd';
        System.out.println(array4[1][1]);

        int[][] array6= {{1,3},{4,5}};
        //this is doing both the declaration and assignment in one line
    }
    //non-assigned index in array will equal to 0
}
