/*
AIM :
To write a Java program to demonstrate the use of an interface.

ALGORITHM :
Step 1: Start the program.
Step 2: Create an interface named Animal.
Step 3: Declare the methods animalsound() and sleep().
Step 4: Create a class dog that implements the Animal interface.
Step 5: Define the animalsound() method to display the dog's sound.
Step 6: Define the sleep() method to display "Zzz".
Step 7: Create an object of the dog class.
Step 8: Call the animalsound() and sleep() methods.
Step 9: Display the output.
Step 10: Stop the program.
*/
interface Animal{
public void animalsound();
public void sleep();
}
class dog implements Animal{
public void animalsound(){
System.out.println("the dog says : BOW BOWW");
}
public void sleep(){
System.out.println("Zzz");
}
}
class b{
public static void main(String [] args){
dog a=new dog();
a.animalsound();
a.sleep();
}
}
/*
OUTPUT :
the dog says : BOW BOWW
Zzz

RESULT :
The program successfully demonstrates the implementation of an interface in Java.
*/
