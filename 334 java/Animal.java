/*
Aim :
    To write a Java program to demonstrate multiple inheritance using interfaces.

Algorithm :
step 1: Create an interface Animal with the method eat().
step 2: Create another interface Pet with the method play().
step 3: Create a class Dog that implements both Animal and Pet.
step 4: Define the eat() and play() methods in the Dog class.
step 5: Create an object d of the Dog class.
step 6: Call the eat() and play() methods.
step 7: Display the output.
*/
interface Animal {
    void eat();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {

    public void eat() {
        System.out.println("Dog eats food");
    }

    public void play() {
        System.out.println("Dog plays with ball");
    }
}

public class MultipleInterfaceExample {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.play();
    }
}
/*
Output :
      Dog eats food
      Dog plays with ball
Result :
       Thus, the Java program to demonstrate multiple inheritance using interfaces was successfully executed.
*/
