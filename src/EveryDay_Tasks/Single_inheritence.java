package EveryDay_Tasks;


public class Single_inheritence {
    //    Create a class Animal with a method makeSound().
//    Create another class Dog that extends Animal and adds a method bark().
//    Call both methods using the Dog object.

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.makesound();
        d1.bark();
        System.out.println("-----------------------");

        puppy p1 = new puppy();
        p1.puppyBarks();
        p1.makesound();
        p1.bark();

    }

}

class Animal{

    void makesound(){
        System.out.println("Animal is making sound");
    }

}
class Dog extends Animal{
 void   bark(){
        System.out.println("The Dog is Barking");
    }

}
//    Multilevel inheritence

class puppy extends Dog{
   void puppyBarks(){
       System.out.println("puppy is barking");
   }
}

