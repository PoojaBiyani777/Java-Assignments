package Rodents;

/* Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc. In the base class,
 * provide methods that are common to all Rodents, and override these in the derived classes to perform
 * different behaviors depending on the specific type of Rodent. Create an array of Rodent, fill it with
 * different specific types of Rodents, and call your base-class methods to see what happens. Make the
 * methods of Rodent abstract whenever possible and all classes should have default constructors that print
 * a message about that class.
 */
abstract class Rodent{
    Rodent(){
        System.out.println("In Rodent Class Constructor.");
    }
    abstract void eat();
    abstract void move();

}
class Mouse extends Rodent {
    Mouse(){
        System.out.println("In Mouse Class Constructor.");
    }
    void eat(){
        System.out.println("Mouse is eating.");
    }
    void move(){
        System.out.println("Mouse is moving.");
    }
}
class Gerbil extends Rodent {
    Gerbil(){
        System.out.println("In Gerbil Class Constructor.");
    }
    void eat(){
        System.out.println("Gerbil is eating.");
    }
    void move(){
        System.out.println("Gerbil is moving.");
    }
}
class Hamster extends Rodent {
    Hamster(){
        System.out.println("In Hamster Class Constructor.");
    }
    void eat(){
        System.out.println("Hamster is eating.");
    }
    void move(){
        System.out.println("Hamster is moving.");
    }
}

public class Rodents {
    public static void main(String[] args) {
        //Array of different kinds of rodent
        Rodent[] array = new Rodent[3];
                array[0]=new Mouse();
                array[1]=new Gerbil();
                array[2]=new Hamster();

        //Calling base-class methods
        for(Rodent i : array){
            i.eat();
            i.move();
        }
    }
}
