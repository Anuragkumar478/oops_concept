🔥 Java OOP Interview Questions
Level 1 — Basic
What is OOP?
What are the four pillars of OOP?
What is a class?
What is an object?
What is the difference between a class and an object?
What is encapsulation?
What is inheritance?
What is polymorphism?
What is abstraction?
Why do we use OOP?
Level 2 — Important Java Questions
What is the difference between method overloading and method overriding?
Can we overload a method by changing only its return type?
Can we override a static method?
Can we override a private method?
Can we override a final method?
What is the super keyword?
What is the this keyword?
What is the difference between this() and super()?
What is a constructor?
Can a constructor be inherited?
Can a constructor be overridden?
Can a constructor be overloaded?
What happens if you don't create a constructor?
What is a default constructor?
What is the difference between a constructor and a method?
Level 3 — Frequently Asked
What is an abstract class?
Can an abstract class have a constructor?
Can an abstract class have non-abstract methods?
Can we create an object of an abstract class?
What is an interface?
What is the difference between an abstract class and interface?
Can an interface have variables?
Can an interface have constructors?
Can an interface have static methods?
Can an interface have default methods?
Why does Java not support multiple inheritance through classes?
How does Java achieve multiple inheritance?
What is the diamond problem?
What is dynamic method dispatch?
What is upcasting?
What is downcasting?
🔥 Output-Based Questions
Question 1
class A {
    void show() {
        System.out.println("A");
    }
}


class B extends A {
    void show() {
        System.out.println("B");
    }
}


public class Main {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}

What is the output and why?

Question 2
class A {
    A() {
        System.out.println("A Constructor");
    }
}


class B extends A {
    B() {
        System.out.println("B Constructor");
    }
}


public class Main {
    public static void main(String[] args) {
        B obj = new B();
    }
}

What is the output?

Question 3
class Test {


    void show(int x) {
        System.out.println("int");
    }


    void show(double x) {
        System.out.println("double");
    }


    public static void main(String[] args) {
        Test t = new Test();
        t.show(10);
    }
}

What is the output?

Question 4
class Parent {
    static void show() {
        System.out.println("Parent");
    }
}


class Child extends Parent {
    static void show() {
        System.out.println("Child");
    }
}


public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
}

What is the output?

Important: This tests whether you know that static methods are hidden, not overridden.

💀 Tricky Interview Questions

These are particularly good for placement interviews:

Why is Java not considered a purely object-oriented language?
What happens when you write:
Animal a = new Dog();

What is the compile-time type and runtime type?

What is the difference between:
Animal a = new Dog();

and

Dog d = new Dog();
Why can't we override a static method?
Why can't we override a private method?
Why can't we override a final method?
Can an abstract class be final?
Can a constructor be static?
Can a constructor be final?
Can an interface extend another interface?
Can a class implement multiple interfaces?
Can an abstract class implement an interface without implementing all its methods?
What is composition vs inheritance?
Which is better: inheritance or composition?
🧠 Scenario-Based Questions

These are very common in actual interviews.

56.

You are designing an e-commerce application.

You have:

User
Admin
Customer
Seller

How would you use inheritance?

57.

Suppose you have:

Payment
 ├── CreditCard
 ├── UPI
 └── PayPal

Which OOP concept would you use?

58.

You want to hide the internal implementation of a bank account from the user. Which OOP concept would you use?

59.

You have:

payment.pay();

and the actual implementation depends on whether the payment is UPI, card, or cash.

Which OOP concept is being used?

60.

Why is encapsulation important in a real application?