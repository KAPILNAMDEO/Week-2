package com.Day05Inheritance.level1AssistedPrograms;

//super Class
class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println(" Animal who's name is  "+name+" and age is "+age+" Sounds like moan!moan");
    }
}
//inherit properties of animal
class Dog extends Animal {
     Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog is a Animal who's name "+name+" and age  "+age+" Sounds "+" bark! bark ");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat is a Animal who's name "+name+" and age  "+age+" Sounds "+" Meaw Meaw ");
    }
}

//inherit properties of animal
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bird is a Animal who's name "+name+" and age  "+age+" Sounds "+" kooh! kooh ");
    }
}
//test class
public class AnimalHierarchy {
    public static void main(String[] args) {

        Animal animal=new Animal("Shimba",6);//call constructor Animal
        animal.makeSound();

        Animal dog = new Dog("Buddy", 3);
        dog.makeSound();
        Animal cat = new Cat("kitty", 2);
        cat.makeSound();
        Animal bird = new Bird("cockoo", 1);
        bird.makeSound();






    }

}

