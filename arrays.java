public class arrays {
    public static void main(String[] args) {

    }
    //in this example, we will explore ways to store data in a specific order
    //this is called an array. in java, arrays are declares as: (dataype)[](arrayname) = new (same dataype)[(arraysize)]
    //here is an example of declaring an array of integers.
    public static void example(){
        int[] arr = new int[9];
    }
    //this creates an array of integers with nine slots. how do we fill it?
    //we can set specific array points to a specific value, like so:
    public static void fillarray(int a) {
        //create array, set dataype, set name, set the size of the array to our integer, a
        int[] arr = new int[a];
        //there are two ways to fill the array with data.
        //one is to do it like this, however it can only be done at the same time that you initialize the array
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //if you want to fill an already existing array, you can do it like this:
        arr[0] = 1;
        arr[1] = 2;
        //note that arrays start at a point of zero. this is especially important because when you are looping over arrays you want to make sure your pointers also start at zero.
        //so any point in an array can be accessed by using arrayname+[position]

    }
    //you can also make a 2d array. this is fairly intuitive:
    public static void twodimension(int row, int col) {
        //to create your array, it goes like this:
        int[][] arr = new int[row][column];
        //2d arrays are always created in order [rows][colums].
        
    }
    //you can also make 3d arrays (useful for images and rgb values, perhaps) and 4d arrays (useful for nothing i can think of), and so on.
    //theoretically you could make a ten dimensional array, but that would be wildly inefficient in 99% of your operations.
    //a few notes about arrays. the easiest way to print out an array in a single line of code is as follows: System.out.println(Arrays.toString(arr));
    //for this to work, you need to include this before your class declaration: import java.util.Arrays;
    //alternatively, you can loop over each element of an array and print it out in a single line, but if you don't know loops or want single lines, this method will do it just the same. 
}

