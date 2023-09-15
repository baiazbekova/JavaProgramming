package oop;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog ("Lucy", "Husky", 'M', 3, "small", "brown");
        System.out.println(dog); //Animal{name='Lucy', breed='Husky', gender=M, age=3, size='small', color='brown'}


        Cat cat = new Cat("Myshyk", "sasyk",'F', 2, "small", "black");
        System.out.println(cat);

        Fish fish = new Fish ("Nora", "salmon", 'm', 3, "small", "blue");
        System.out.println(fish);
    }
}
