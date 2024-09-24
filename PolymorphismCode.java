
package polymorphismcode;


abstract class Animal {
    public abstract String makeSound();
}


class Dog extends Animal {
    public String makeSound() {
        return "Bark!";
    }
}

class Cat extends Animal {
    public String makeSound() {
        return "Meow!";
    }
}

class Cow extends Animal {
    public String makeSound() {
        return "Moo!";
    }
}

 class AnimalSoundTest {
    public static void animalSound(Animal animal) {
        System.out.println(animal.makeSound());
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        animalSound(dog);  
        animalSound(cat);  
        animalSound(cow);  
    }
}
