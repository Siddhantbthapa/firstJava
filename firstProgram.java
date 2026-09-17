/*
 * common command line commends
 * cmd - to open the command line
 * cd-  change directrory
 * dir- to display the directory content
 * mkdir- to create new directory
 * exit - to close commandline enviroment
 * 
 * structure of java
 * 
 * thread is running in the background for any program in java 
 * program runs in the thread that consumes ram and cpu 
 * 
 * 
 * 
 * 3 types of comments in java
 * 1. line command starts with // 
 * 2. block comments: spams multiple line /*   *** *\ 
 * 
 * 3. java doc utility /** starts with double star 
 **/

package lecture_09_02;

// in camel case aka stander java 
public class firstProgram {
	// for one project one static void main
	// static void main (String (any name)[] )
	public static void main(String args[]) {
		System.out.println("Hello world");
		double credit = 65, points = 20;

		System.out.println("with " + credit + " earned " + points);
		// add them
		System.out.println(5 + 3 + " Value");

		// does not add them
		System.out.println("value " + 5 + 3);

		// last line of code to termiante the background running thread
		System.exit(0);
	}
}
