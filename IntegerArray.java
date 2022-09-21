import java.lang.Math;
import java.util.Arrays;

//this class is used to solve all sorts of IntegerArray problems
public class IntegerArray {

    // create an int array that contains random integers in the range [0,100]

    // display the menu options, get the user's choice, call the methods
    // until the user decides to exit, keep displaying it
    public static void main(String[] args) {

        int min = 0;
        int max = 100;
        int[] nums = new int[10];

        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * (max - min + 1) + min);
        }

        System.out.println(Arrays.toString(nums));

        System.out.println("Please choose what you would like to do:");
        System.out.println("1. Find the minimum and maximum of the array");
        System.out.println("2. Find the average of the array");
        System.out.println("3. find the sum of the elements with odd and even numbered indexes");
        System.out.println("9. Exit the program.");

    }

    // find the minimum and maximum of the array, implemented as different methods

    // find the average of the array, then display the differences of each array to
    // the average

    // find the sum of the odd and even numbered indexes

}