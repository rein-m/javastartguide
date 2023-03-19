/**
 * This program demonstrates the use of for loops and while loops in Java.
 * We will use loops to print numbers, iterate over an array, and read user input.
 */

public class LoopDemo {

    /**
     * The main method is the entry point of our program.
     * This is where the execution starts.
     * 
     */
    public static void main(String[] args) {

        
        // using a for loop to print numbers from 1 to 10
        // we start with an integer variable i initialized to 1.
        // the loop condition is i <= 10, which means the loop will execute as long as i is less than or equal to 10.
        // the increment statement is i++, which means i will be incremented by 1 after each iteration of the loop.
        // inside the loop, we simply print the value of i followed by a space.
        // after the loop, we print a new line to separate the output from the next loop.
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // using a while loop to print even numbers from 2 to 10
        // we start with an integer variable j initialized to 2.
        // the loop condition is j <= 10, which means the loop will execute as long as j is less than or equal to 10.
        // inside the loop, we print the value of j followed by a space.
        // we then increment j by 2, which ensures that we only print even numbers.
        // after the loop, we print a new line to separate the output from the next loop.
        int j = 2;
        while (j <= 10) {
            System.out.print(j + " ");
            j += 2;
        }
        System.out.println();

        // using a for loop to iterate over an array
        // we create an integer array called numbers and initialize it with five elements.
        // we use a for loop to iterate over the elements of the array.
        // the loop starts with an integer variable k initialized to 0.
        // the loop condition is k < numbers.length, which means the loop will execute as long as k is less than the length of the array.
        // the increment statement is k++, which means k will be incremented by 1 after each iteration of the loop.
        // inside the loop, we simply print the value of the current element of the array followed by a space.
        // after the loop, we print a new line to separate the output from the next loop.
        int[] numbers = { 1, 3, 5, 7, 9 };
        for (int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + " ");
        }
        System.out.println();

    }
}