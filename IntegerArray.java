import java.lang.Math;
import java.util.Arrays;

//this class is used to solve all sorts of IntegerArray problems
import java.util.Scanner;
public class IntegerArray {

    // display the menu options, get the user's choice, call the methods
    // until the user decides to exit, keep displaying it
    public static void main(String[] args) {
        int programContinuation = 1;        

        //Elkhan's implementation of random number generator + array generation
        int min = 0;
        int max = 100;
        int[] nums = new int[10];

        //for loop to change each empty element with a random number between [1,100]
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * (max - min + 1) + min);
        }

        //prints out the array list
        System.out.println(Arrays.toString(nums));

        //scanner for user input
        Scanner in = new Scanner(System.in);

        //yohan you's implementation of some sort of user interface
        while (programContinuation > 0)
        {
            System.out.println("Please choose what you would like to do:");
            System.out.println("1. Find the minimum and maximum of the array");
            System.out.println("2. Find the average of the array");
            System.out.println("3. find the sum of the elements with odd and even numbered indexes");
            System.out.println("0. Exit the program.");
    
            int userInput = in.nextInt();

            if (userInput == 1){
                System.out.println("mimimum: " + MaxValue(nums));
                System.out.println("maximum: " + MinValue(nums));
                }
    
            if (userInput == 2)
                
                {
                AverageArray(nums);
                }
    
            if (userInput == 3)
                {
                evenIndexSum(nums);
                oddIndexSum(nums);
                }
    
            if (userInput == 0)
                {
                    programContinuation = 0;
                    in.close();
                }
        }
    }

    // find the minimum and maximum of the array, implemented as different methods
    public static int MaxValue(int[] list) 
    {

        int maxValue = list[0];

        for(int i = 0; i < list.length; i++)
        {
            if(list[i] > maxValue)
            {
                maxValue = list[i];
            }
        }

        return maxValue;
    }

    public static int MinValue(int[] list)
    {

        int minValue = list[0];

        for(int i = 0; i < list.length; i++)
        {
            if(list[i] < minValue)
            {
                minValue = list[i];
            }

        }

        return minValue;
    }

    // find the average of the array, then display the differences of each array to the average

    public static void AverageArray(int[] list) {
        int theSum = 0;
        // finding the sum of the numbers in array
        for(
            int k = 0;k<list.length;k++)
                {
                theSum += list[k];
                }

        // the average
        int average = theSum / list.length;

        // difference of each array
        int[] difference = new int[list.length];for(
        int eachDifference = 0;eachDifference<list.length;eachDifference++)
            {
            difference[eachDifference] = list[eachDifference] - average;
            }
        System.out.println("The Original Array: ");
        for(int i = 0;i<list.length;i++)
            {
            System.out.print(list[i] + ", ");
            }      
        System.out.println("The average: " + average);

        System.out.print("The differences of each array to the average: ");
        for(int i = 0;i<list.length;i++)
            {
            System.out.print(difference[i] + ", ");
            }
    }

    //Sum of elements with odd or even-numbered indexes

    public static void evenIndexSum(int[] list){
        int evenVariableSum = 0;

        for (int i = 0; i < list.length; i++){
            if (list[i] % 2 == 0){
                evenVariableSum += list[i];
                }        
        }
        
        System.out.println("Even index sum: " + evenVariableSum);
    }

    public static void oddIndexSum(int[] list){
        int oddVariableSum = 0;

        for (int i = 0; i < list.length; i++){
            if (list[i] % 2 == 1){
                oddVariableSum += list[i];
                }            
        }
        
        System.out.println("Odd index sum: " + oddVariableSum);
    }

}