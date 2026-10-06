/*
Aim:
To write a Java program to demonstrate multilevel inheritance.

Algorithm :
 a class Animal with an eat() method.
Step 2: Create a class Dog that inherits the Animal class.
Step 3: Define the bark() method in the Dog class.
Step 4: Create a class Puppy that inherits the Dog class.
Step 5: Define the play() method in the Puppy class.
Step 6: Create objects for Dog and Puppy.
Step 7: Call the inherited and own methods of the objects.
Step 8: Display the output.
*/
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}

public class Main {
    public static void main(String[] args) {

        
        Dog d = new Dog();
        d.eat();  
        d.bark();  

        System.out.println();
        Puppy p = new Puppy();
        p.eat();  
        p.bark(); 
        p.play();  
    }
}
/*
Output :
Animal eats
Dog barks
Animal eats
Dog barks
Puppy plays

Result:
Thus, the Java program to demonstrate multilevel inheritance was successfully executed.
*/
