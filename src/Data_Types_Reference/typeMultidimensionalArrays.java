package Data_Types_Reference;

public class typeMultidimensionalArrays {
    public static void main(String[] args){

        //multidimensional arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7}};

        /*To access the elements of the myNumbers array, specify two indexes, one for the array,
        and one for the element inside that array.
         */

        //This will access this part of array {5, 6, 7,} on the element number 2
        int value1= myNumbers[1][2];
        System.out.println("Value 1 : " + value1);

        //This will access this part of array {1, 2, 3, 4] on the element number 0/ first element
    }
}
