public class startguide {
    // Welcome! This is a basic guide to get you started with java and coding on your own.
    //this is a code comment, essentially lines that, (by using two slashes) the computer, when reading code, will ignore. 
    // you can do this on every line, or by typing a singular slash and an asterisk  you can make it a multi like comment.
    /* 
     * like this!
     */
    /* To check if you have a Java Development Kit (JDK) installed on your computer, open the command prompt and type "java -version", and after that type "javac -version"
    If you have a JDK installed, it will display the version number. If not, you will see an error message.
    If you don't have a JDK installed, grab Amazon Corretto (for now still a good option, may age poorly)
    (sigh, companies)

    Amazon Corretto is a free, open-source, production-ready distribution of the Open Java Development Kit (OpenJDK) that is available for download from the Amazon website. To download and install Amazon Corretto, follow these steps:

    Go to the Amazon Corretto website: https://aws.amazon.com/corretto/
    Click on the "Download" button for the version of Corretto you want to use (e.g., Corretto 11 or Corretto 17).
    Follow the prompts to download the installation file for your operating system.
    Once the file is downloaded, run the installer and follow the prompts to install Corretto on your computer.
    To compile and run Java files using the command prompt, follow these steps:

    Open the command prompt and navigate to the directory where your Java file is located using the "cd" command.
    Compile the Java file by typing "javac filename.java" (replace "filename" with the name of your Java file).
    If the compilation is successful, a new file with the extension ".class" will be created in the same directory as your Java file.
    Run the Java file by typing "java filename" (again, replace "filename" with the name of your Java file, but without the ".java" extension).
    If everything is working correctly, the output of your Java program will be displayed in the command prompt.
    It's important to note that in order for these steps to work, your Java file must be correctly formatted and free of syntax errors. */


    //data in java is stored as various specific datatypes/ here is a class showing you how to instantiate each of these datatypes. 
    public static void types() {
        //here is an integer:
        int x = 0;
        //here is a double:
        int y = 0.5;
        //here are 2 booleans:
        boolean bool1 = false;
        boolean bool2 = true;
        //here is a string:
        String str = "hello";
        //for all of these datatypes, we have to start by declaring what KIND of data it is, and then give it a name. after this we have an equals sign, and then we assign it a value. 
        // booleans default to false, and strings default to null if we haven't set the value of our boolean or integers. this isn't the case for integers, longs (x2 size integers), floats, and doubles (x2 size floats). these need a value to be set if we want to use them.


    }
    //you may have noticed that we put all of this inside curly braces and a header line: ("public static void types()"). this is a method, essentially a structure that allows you to perform tasks at certain points in your code when you want to. 
    //the PUBLIC keyword tells the computer how accessible this method is. we will examine this more later, but for now we just want to make everything public. 
    //next, we have to tell the computer whether the method and its data should be static or not. this tells the computer whether the method is only a specific instance, or belongs to the overall class and will never be changed. this can also be done with variables.
    //next, we have a return type. this tells the computer what to expect back when we call (use) the method. this can be set to any datatype. if you don't want to return anything, use the void return type.
    //after this, we have the method name. this isnt super important, and can generally be whatever you want it to be. when calling a method, you want to use that method name.
    //finally, in parentheses, we have what kind of data we want the method to take in. this data can come from anywhere, but once you pass it into method data in, it will be essentially copied into the method as the data in type.
     //here is an example of method declaration:
    public static int example(int a){ 
        //the return type is an int, and the return statement returns the int a, which has been declared as one of the 'data in' variables
        return a;
        //now we will see how we would use this method
    }

    //below this, we declare our main method. every java file needs a main method, and it needs to be declared exactly like so. 


    public static void main(String[] args) {

    }

    //now we will use our 'example' method, and we will call it in our 'usingex' method. we will call example on our integer of x, which we will set inside the class.
    public static void usingex() {
        int x = 5;
        //declaring an integer inside our class
        //now we call the method example
        example(x);
        //we pass in our integer x, which has a value of 5. it gets copied to integer a in the method example, and the method returns the integer a, which is 5.
    }
    //let's view some ways to play with integers
    public static void intplay(int a) {
        //this classes passes in an integer, which we can then use as 'a' inside this class.
        //what if we want to print one more than our integer a?
        //we can do it like this:
        System.out.println(a++);
        //as an aside, we print things in java with one of these two ways: using "System.out.println();" or "return;" you can also use "System.out.print();". (they do the same thing but format lines differently)
    }
    //we can also do various math operations in java. here are some examples at a simple level. (there are more in depth math functions that can be done in java with relative ease, but i wont go into them for now)
    public static void simplemath(int x) {
        //let's take in int x, and set the value of our int z to twice the value of x.
        int z = 2 * x;
        //in java, we can multiply: "a + b"
        //subtract "a - b"
        //multiply "a * b"
        //divide "a / b"
        //we can also do order of operations stuff. like this:
        z = (z + 1) / 2;
        //since we set this value equal to, we are resetting the value of z to whatever we have set it equal to, and the previous value is overwritten.

    }
    // Control Flow:
    // Control flow statements allow us to control the order in which statements are executed in our program.
    // - If/else statements: allows us to execute a block of code if a condition is true, and a different block of code if the condition is false.
    public static void cf(int x) {
        if (x == 0) {
            x++;
        }
        if (x == 1) {
            System.out.println("we have checked if x was equal to zero, then added one if that was true, then checked if x was equal to one, then printed this statement!");
        }
        //if statements can contain many conditions inside them, differenciated by && (if this AND that) || (if this OR that), !|| (if this OR NOT that) !&& (if this AND NOT that) 
    }
    //now that we have seen some simple math functions in java and if statements, we can combine them to create a more complex method:
    public static void mathshowcase(int a, int b, int c) {
        if (a == 1 && b == 1 && c == 1) {
            System.out.println("the passsed in integers are all one!");
        } else {
            System.out.println("the passsed in integers are NOT all one!");

        }
    }
    //this should give you a fairly good grasp of the basics, but look up anything you dont understand! i will probably periodically update this until it gets complex enough that you would be better off googling it.
    

    
}
