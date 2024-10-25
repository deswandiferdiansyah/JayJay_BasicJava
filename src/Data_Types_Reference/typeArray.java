package Data_Types_Reference;

public class typeArray {
    public static void main(String[] args){
        int[] numbers = {22, 33, 44};

        System.out.println("Countent of number before : " + numbers[0]);
        System.out.println("Countent of number before : " + numbers[1]);
        System.out.println("Countent of number before : " + numbers[2]);

        //change elements numbers[0]
        numbers[0] = 55;

        System.out.println("Countent of number before : " + numbers[0]);
        System.out.println("Countent of number before : " + numbers[1]);
        System.out.println("Countent of number before : " + numbers[2]);

        //check the length of array numbers
        System.out.println("The length of number : " + numbers.length);


    }
}
