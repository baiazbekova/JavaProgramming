package practice;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.size = "Large";
        dog1.age = 12;
        dog1.color = "Brown";
        dog1.gender = 'F';

        System.out.println(dog1);



        Dog dog2 = new Dog();
        dog2.name = "Max";
        dog2.breed = "German Shepherd";
        dog2.size = "Small";
        dog2.age = 6;
        dog2.color = "Black";
        dog2.gender = 'M';

        System.out.println(dog2);

        dog1.eat();
        dog2.play();


    }
}
