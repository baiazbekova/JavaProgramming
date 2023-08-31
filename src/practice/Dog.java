package practice;

public class Dog {

    public String name;  //instance variable
    public String breed;
    public String size;
    public int age;
    public String color;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                '}';
    }

    public char gender;

    public void eat(){ //instance method
        System.out.println(name + " is eating");
    }
    public void drink(){
        System.out.println(name + " is drinking");

    }

    public void play(){
        System.out.println(name + " is playing");
    }
}
