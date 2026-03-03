package evedenceno3;

public class EvedenceNo3 {

    public static void main(String[] args) {

        // 3 No Question Answer
        
        Animal dog = new Animal.Dog();
        Animal cat = new Animal.Cat();

        dog.sound();
        dog.sleep();

        cat.sound();
        cat.sleep();
    }

    interface Animal {

        void sound();

        void sleep();

        class Dog implements Animal {

            @Override
            public void sound() {
                System.out.println("Dog barks: Woof Woof!");
            }

            @Override
            public void sleep() {
                System.out.println("Dog is sleeping...");
            }
        }

        class Cat implements Animal {

            @Override
            public void sound() {
                System.out.println("Cat meows: Meow Meow!");
            }

            @Override
            public void sleep() {
                System.out.println("Cat is sleeping...");
            }
        }

    }

}
