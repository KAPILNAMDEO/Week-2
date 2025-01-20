class Person {
    String name;
    int age;

    // Default constructor
    Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Display method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class PersonCloneDemo {
    public static void main(String[] args) {
        // Creating a person using parameterized constructor
        Person person1 = new Person("John Doe", 25);
        System.out.println("Person 1 Details:");
        person1.display();

        // Creating a new person by copying person1
        Person person2 = new Person(person1);
        System.out.println("\nPerson 2 (Clone of Person 1) Details:");
        person2.display();
    }
}
