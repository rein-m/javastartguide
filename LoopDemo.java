
public class loops{
    public static void main(String[] args) {




    }
    //let's talk about loops. loops are a fundamental part of programming and create an easy way to go through arrays and read pieces of data one by one. 
    //let's look at an example of a loop and how to make them in java.
    public static void loopsdemo(){
        //for loops are one kind of loop. you start them with something (usually an integer) to set the starting point of the loop condition (ex: int i = 0)
        //after this, we set the full loop condition. (ex: i < 10) this means that as long as i is less than 10 the loop will continue to iterate.
        //finally we set the loop iteration incrementor, which will increment the the loop's variable by however much you set it to. (ex: i++)
        //this all comes together to look like this: 
        for (int i = 0; i < 10; i++) {
            //do stuff for each iteration of the loop here.

        }
        //what can we do with loops? well, it makes certain things much more efficient. let's say you wanted to print every number 0-500 on a new line for each. you could write 500 println statements, or make a loop with one line of code in it.
        for(int i = 0; i < 500; i++) {
            System.out.println(i);
        } 
        //this loop will do exactly that: print every number 0-500 on a new line. much better than writing 500 println statements.
        //we can also use this to very easily fill arrays. (see arrays tutorial for clarification if needed)
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            //note that we don't need to know exactly how long our array is to still iterate over it. using arr.length gives us from the start to end perfectly.
            arr[i] = i;
            //this loop will fill the array with numbers 0-10, as it fills the array with the number it is pointing to. 


        }
        //now might be a good time to talk about pointer integers. you might notice that in each of the loops i redeclared the integer as int i = 0. this is because if you do it like this, the pointer integer is self contained in the loop. 
        //it cant be accessed outside of the loop unless you delcare the pointer outside of the loop, like i do here:
        int l = 0;
        //now we don't need to declare l in my loop statement:
        //you still need the semicolon to tell the compiler that you have predeclared l.
        for (; l < 10; l++) {

        }
        //once this is done however, l will be 9 even accessed outside of the loop. 
        System.out.println(l);
        //will print nine.
        


        //in my arrays tutorial, i spoke of printing an array with a loop. here is how we would do that:
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //there's one other kind of loop, called a while loop. it functions very simply as while(condition=true) { do thing }
        //here is how a while loop that does the same thing as our 0-500 loop looks like:
        //note that we need to predeclare the integer outside of our while loop.
        int n = 0;
        while(n < 500) {
            System.out.println(n);
            //adding our incrementer here makes it all work:
            n++;
            //this will fire once per loop, meaning it functions the same.
        }
        //we have been using incrementers, but you don't strictly need them. not using them has some niche use cases, but for most beginner purposes will result in a stackoverflow error. 
        //the last thing we will look at is a break statement, designed to exit a loop early.
        for (int i = 0; i < 10000; i++) {
            if(i == 1337) {
                System.out.println(i);
                break;
                //this if statement will check each iteration if i is equal to 1337, and if it is, it will print i, and then the break line will break out of the loop, and it won't continue to 10000.
            } else {
                System.out.println("not broken, continuing");
                //this is purely for visual purposes, but this statement will show up 1337 times before the number is reached. it will NOT show up 10000 times, because of the break.
            }
        }
    }

}

        
       
