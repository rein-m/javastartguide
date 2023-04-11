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
        //note that arrays start at a point of zero. this is especially important because when you are looping over arrays in loops you want to make sure your pointers also start at zero.
        //so any point in an array can be accessed by using arrayname+[position]

    }
    //a few notes about arrays. the easiest way to print out an array in a single line of code is as follows: System.out.println(Arrays.toString(arr));
    //alternatively, you can loop over each element of an array and print it out in a single line, but if you don't know loops or want single lines, this method will do it just the same. 
}
