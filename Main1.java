// 1. This is the abstract class (the blueprint)
abstract class Animal {
    
    // Abstract method (no body, no code inside!)
    // Every child class MUST fill this in.
    abstract void makeSound();

    // Regular method (has code)
    // Child classes automatically share this without rewriting it.
    void sleep() {
        System.out.println("Zzz...");
    }
}

// 2. This is a regular class that extends the abstract class
class Dog extends Animal {
    
    // Java forces us to write this method because it was abstract!
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// 3. Testing our code
public class Main1 {
    public static void main(String[] args) {
        // Animal myAnimal = new Animal(); // ERROR! You cannot create an abstract object directly.
        
        Dog myDog = new Dog();
        myDog.makeSound(); // Prints: Woof! Woof!
        myDog.sleep();     // Prints: Zzz...
    }
}
