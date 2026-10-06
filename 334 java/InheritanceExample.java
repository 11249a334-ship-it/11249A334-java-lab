/*
Aim :
    To write a Java program to demonstrate single inheritance.

Algorithm :
Step 1: Create a class Animal with an eat() method.
Step 2: Create a class Dog that inherits the Animal class.
Step 3: Define the bark() method in the Dog class.
Step 4: Create an object of the Dog class.
Step 5: Call the eat() and bark() methods.
Step 6: Display the output.
*/

class Animal{
void eat()
{
System.out.println("Animal is eating");
}
}
class Dog extends Animal {
void bark()
{
System.out.println("Dog is barking");
}
}
public class InheritanceExample{
public static void main(String[] args){
Dog d=new Dog();
d.eat();
d.bark();
}
}
/*
Output:
Animal is eating
Dog is barking

Result :
Thus, the Java program to demonstrate single inheritance was successfully executed.
*/
